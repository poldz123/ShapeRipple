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

package com.rodolfonavalon.shaperipplelibrary.util;

import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;

public class ShapePulseUtil {

    /**
     * The default color for random colors
     */
    private static final int[] DEFAULT_RANDOM_COLOUR_SEQUENCE = {
            Color.parseColor("#673AB7"),
            Color.parseColor("#3F51B5"),
            Color.parseColor("#2196F3"),
            Color.parseColor("#03A9F4"),
            Color.parseColor("#00BCD4"),
            Color.parseColor("#009688"),
            Color.parseColor("#8BC34A"),
            Color.parseColor("#4CAF50"),
            Color.parseColor("#FF5722"),
            Color.parseColor("#F44336")};

    /**
     * Calculate the current color by the current fraction value.
     *
     * @param fraction The current fraction value
     * @param startValue The start color
     * @param endValue The end color
     * @return The calculate fraction color
     */
    public static int evaluateTransitionColor(float fraction, int startValue, int endValue) {
        int startA = (startValue >> 24) & 0xff;
        int startR = (startValue >> 16) & 0xff;
        int startG = (startValue >> 8) & 0xff;
        int startB = startValue & 0xff;

        int endA = (endValue >> 24) & 0xff;
        int endR = (endValue >> 16) & 0xff;
        int endG = (endValue >> 8) & 0xff;
        int endB = endValue & 0xff;

        return ((startA + (int) (fraction * (endA - startA))) << 24) |
                ((startR + (int) (fraction * (endR - startR))) << 16) |
                ((startG + (int) (fraction * (endG - startG))) << 8) |
                ((startB + (int) (fraction * (endB - startB))));
    }

    /**
     * Generate a list of random colors based on {@link #DEFAULT_RANDOM_COLOUR_SEQUENCE} colors
     *
     * @param context The context of the application
     * @return The list of colors
     */
    public static ArrayList<Integer> generateRandomColours(Context context) {
        ArrayList<Integer> randomColours = new ArrayList<>();

        for (Integer color : DEFAULT_RANDOM_COLOUR_SEQUENCE) {
            randomColours.add(color);
        }

        return randomColours;
    }


}
