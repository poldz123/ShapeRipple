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

package com.rodolfonavalon.shaperipplelibrary.data;

import android.graphics.Color;

import com.rodolfonavalon.shaperipplelibrary.ShapeRipple;
import com.rodolfonavalon.shaperipplelibrary.model.BaseShape;

public class ShapeRippleEntry {

    /**
     * The shape renderer of the ripple
     */
    private BaseShape baseShape;

    /**
     * Flag for when the ripple is ready to be rendered
     * to the view
     */
    private boolean isRender;

    /**
     * The current radius size of the ripple
     */
    private float radiusSize;

    /**
     * The current multiplier value of the ripple
     */
    private float multiplierValue;

    /**
     * The current index of the ripple in the list
     * from {@link ShapeRipple#shapeRippleEntries}
     */
    private int rippleIndex;

    /**
     * The X position of the ripple, defaulted to the middle of the view
     */
    private int x;

    /**
     * The Y position of the ripple, defaulted to the middle of the view
     */
    private int y;

    /**
     * The original color value which is only changed when view is created or
     * the ripple list is re configured
     */
    private int originalColorValue;

    /**
     * The changeable color value which is used when color transition,
     * on measure to the view, when render process happens
     */
    private int changingColorValue;

    public ShapeRippleEntry(BaseShape baseShape) {
        this.baseShape = baseShape;
    }

    public BaseShape getBaseShape() {
        return baseShape;
    }

    public void setBaseShape(BaseShape baseShape) {
        this.baseShape = baseShape;
    }

    public float getRadiusSize() {
        return radiusSize;
    }

    public void setRadiusSize(float radiusSize) {
        this.radiusSize = radiusSize;
    }

    public int getOriginalColorValue() {
        return originalColorValue;
    }

    public void setOriginalColorValue(int originalColorValue) {
        this.originalColorValue = originalColorValue;
        setChangingColorValue(originalColorValue);
    }

    public float getMultiplierValue() {
        return multiplierValue;
    }

    public void setMultiplierValue(float multiplierValue) {
        this.multiplierValue = multiplierValue;
    }

    public boolean isRender() {
        return isRender;
    }

    public void setRender(boolean render) {
        isRender = render;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getChangingColorValue() {
        return changingColorValue;
    }

    public void setChangingColorValue(int changingColorValue) {
        this.changingColorValue = changingColorValue;
    }

    public int getRippleIndex() {
        return rippleIndex;
    }

    public void setRippleIndex(int rippleIndex) {
        this.rippleIndex = rippleIndex;
    }

    /**
     * Reset all data of this shape ripple entries
     */
    public void reset() {
        isRender = false;
        multiplierValue = -1;
        radiusSize = 0;
        originalColorValue = Color.TRANSPARENT;
        changingColorValue = Color.TRANSPARENT;
    }
}
