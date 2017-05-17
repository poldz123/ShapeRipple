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

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.rodolfonavalon.shaperipplelibrary.ShapeRipple;

public abstract class BaseShape {
    /**
     * The width of the layout in pixel
     */
    protected int width;

    /**
     * The height of the layout in pixel
     */
    protected int height;

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

    /**
     * Setup method for the {@link BaseShape} before ripple rendering happens.
     *
     * NOTE: This is only called once every time the {@link BaseShape} is attached to the
     * {@link ShapeRipple}
     *
     * @param context The {@link ShapeRipple} context
     * @param shapePaint The Paint that the ripple uses to render in the canvas.
     */
    public abstract void onSetup(Context context, Paint shapePaint);

    /**
     * This will draw the actual ripple to the canvas.
     *
     * @param canvas The canvas where the ripple is drawn
     * @param x The x axis if the ripple, x means the middle x-axis.
     * @param y The y axis if the ripple, y means the middle y-axis.
     * @param radiusSize The current radius size if the ripple, this changes over time.
     * @param color The current color of the ripple, this changes over time.
     * @param rippleIndex The index of the ripple, 0 index is the middle and n-1 is the last outer ripple
     * @param shapePaint The paint of the ripple.
     */
    public abstract void onDraw(Canvas canvas, int x, int y, float radiusSize, int color, int rippleIndex, Paint shapePaint);
}
