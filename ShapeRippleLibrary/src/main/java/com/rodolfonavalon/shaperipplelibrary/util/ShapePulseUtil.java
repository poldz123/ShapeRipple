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
import android.support.v4.content.ContextCompat;

import com.rodolfonavalon.shaperipplelibrary.R;

import java.util.ArrayList;

public class ShapePulseUtil {

    /**
     * The default color for random colors
     */
    private static final int[] DEFAULT_RANDOM_COLOUR_SEQUENCE = {R.color.primary_deep_purple,
    R.color.primary_indigo, R.color.primary_blue, R.color.primary_light_blue, R.color.primary_cyan,
    R.color.primary_teal, R.color.primary_light_green, R.color.primary_green, R.color.primary_deep_orange,
    R.color.primary_red};

    /**
     * Calculate the current color by the current fraction value.
     *
     * @param fraction The current fraction value
     * @param startValue The start color
     * @param endValue The end color
     * @return The calculate fraction color
     */
    public static int evaluateTransitionColor(float fraction, int startValue, int endValue) {
        int startInt = startValue;
        int startA = (startInt >> 24) & 0xff;
        int startR = (startInt >> 16) & 0xff;
        int startG = (startInt >> 8) & 0xff;
        int startB = startInt & 0xff;

        int endInt = endValue;
        int endA = (endInt >> 24) & 0xff;
        int endR = (endInt >> 16) & 0xff;
        int endG = (endInt >> 8) & 0xff;
        int endB = endInt & 0xff;

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

        for (Integer colorId : DEFAULT_RANDOM_COLOUR_SEQUENCE) {
            randomColours.add(ContextCompat.getColor(context, colorId));
        }

        return randomColours;
    }


}
