package com.rodolfonavalon.shaperipplelibrary.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Image extends BaseShapeRipple {

    private Bitmap bitmap;
    private Rect rect;

    public Image(Context context, int bitmapResource) {
        this.rect = new Rect();
        this.bitmap = BitmapFactory.decodeResource(context.getResources(), bitmapResource);
    }

    @Override
    public void draw(Canvas canvas, int x, int y, float radiusSize, int color, int rippleIndex, Paint shapePaint) {
        int currentImageSize = (int) radiusSize;

        // Get the current alpha channel of the color
        int currentAlpha = 0xFF & (color >> 24);
        shapePaint.setAlpha(currentAlpha);

        this.rect.set(x - currentImageSize, y - currentImageSize, x + (int) radiusSize, y + (int) radiusSize);

        canvas.drawBitmap(bitmap, null, this.rect, shapePaint);
    }
}
