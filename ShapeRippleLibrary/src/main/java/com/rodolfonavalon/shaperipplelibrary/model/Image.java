package com.rodolfonavalon.shaperipplelibrary.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Image extends BaseShapeRipple {

    private Bitmap bitmap;
    private Rect rect;

    public Image() {
        this.rect = new Rect();
    }

    public Image(Bitmap bitmap) {
        this();

        this.bitmap = bitmap;
    }

    public Image(Context context, int bitmapResource) {
        this();

        this.bitmap = BitmapFactory.decodeResource(context.getResources(), bitmapResource);
    }

    @Override
    public void draw(Canvas canvas, int x, int y, float currentRadiusSize, int currentColor, int rippleIndex) {
        int currentImageSize = (int)currentRadiusSize;

        // Get the current alpha channel of the color
        int currentAlpha = 0xFF & (currentColor >> 24);

        this.shapePaint.setAlpha(currentAlpha);
        this.rect.set(x - currentImageSize, y - currentImageSize, x + (int)currentRadiusSize, y + (int)currentRadiusSize);

        canvas.drawBitmap(bitmap, null, this.rect, this.shapePaint);
    }
}
