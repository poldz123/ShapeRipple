package com.rodolfonavalon.shaperipplelibrary;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;

import static com.rodolfonavalon.shaperipplelibrary.DebugLogger.logD;
import static com.rodolfonavalon.shaperipplelibrary.DebugLogger.logE;

/**
 * This is a controller for ICE_CREAM_SANDWICH and up, where is handles the activity life cycle.
 * Each call to {@link Activity#onPause()} will stop the ripple and restart it when it call the
 * {@link Activity#onResume()}.
 * <p>
 * We make sure that the listener is detached when activity has been destroyed.s
 */
@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
class LifeCycleManager implements Application.ActivityLifecycleCallbacks {

    private ShapeRipple shapeRipple;
    private Activity activity;

    LifeCycleManager(ShapeRipple shapeRipple) {
        this.shapeRipple = shapeRipple;
    }

    void attachListener() {
        if (shapeRipple == null) {
            logE("Shape Ripple is null, activity listener is not attached!!");
            return;
        }

        activity = getActivity(shapeRipple.getContext());
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    private void detachListener() {
        if (activity == null) {
            return;
        }

        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {}

    @Override
    public void onActivityStarted(Activity activity) {}

    @Override
    public void onActivityResumed(Activity activity) {
        if (shapeRipple == null || this.activity != activity) {
            return;
        }

        shapeRipple.restartRipple();
        logD("Activity is Resumed");
    }

    @Override
    public void onActivityPaused(Activity activity) {
        if (shapeRipple == null || this.activity != activity) {
            return;
        }

        shapeRipple.stop();
        logD("Activity is Paused");
    }

    @Override
    public void onActivityStopped(Activity activity) {}

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {}

    @Override
    public void onActivityDestroyed(Activity activity) {
        if (this.activity != activity) {
            return;
        }

        detachListener();
        logD("Activity is Destroyed");
    }

    private Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }

        throw new IllegalArgumentException("Context does not derived from any activity, Do not use the Application Context!!");
    }
}
