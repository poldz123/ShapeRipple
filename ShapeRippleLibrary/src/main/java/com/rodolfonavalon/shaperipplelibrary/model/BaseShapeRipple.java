/*
 * Copyright 2016 Rodolfo Navalon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rodolfonavalon.shaperipplelibrary.model;

import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class BaseShapeRipple {

    /**
     * The default paint for the ripple
     */
    protected Paint shapePaint;

    /**
     * The width of the layout in pixel
     */
    protected int width;

    /**
     * The height of the layout in pixel
     */
    protected int height;

    /**
     * The stroke width of ripple in pixel
     */
    protected float strokeWidth;

    public BaseShapeRipple() {
        init();
    }

    private void init() {
        shapePaint = new Paint();
        shapePaint.setAntiAlias(true);
        shapePaint.setDither(true);
        shapePaint.setStyle(Paint.Style.STROKE);
    }

    public abstract void draw(Canvas canvas, int x, int y, float currentRadiusSize, int currentColor, int rippleIndex);

    /**
     * @return The default paint for the ripple
     */
    public Paint getShapePaint() {
        return shapePaint;
    }

    /**
     * @return The stroke width in pixel
     */
    public float getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Change the stroke width of the ripple
     *
     * @param strokeWidth The stroke width in pixel
     */
    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;

        shapePaint.setStrokeWidth(strokeWidth);
    }

    /**
     * @return The width of the layout in pixel
     */
    public int getWidth() {
        return width;
    }

    /**
     * Change the width of the layout
     *
     * @param width The width of the layout in pixel
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return The height of the layout in pixel
     */
    public int getHeight() {
        return height;
    }

    /**
     * Change the height of the layout
     *
     * @param height The height of the layout in pixel
     */
    public void setHeight(int height) {
        this.height = height;
    }
}
