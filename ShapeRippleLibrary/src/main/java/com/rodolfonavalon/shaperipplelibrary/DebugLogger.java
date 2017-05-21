package com.rodolfonavalon.shaperipplelibrary;

import android.util.Log;

class DebugLogger {
    /**
     * Log DEBUG with message
     */
    static void logD(String message) {
        if (!ShapeRipple.DEBUG) {
            return;
        }

        Log.d(ShapeRipple.TAG, message);
    }

    /**
     * Log ERROR with message
     */
    static void logE(String message) {
        if (!ShapeRipple.DEBUG) {
            return;
        }

        Log.e(ShapeRipple.TAG, message);
    }
}
