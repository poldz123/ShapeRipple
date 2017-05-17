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

public class Circle extends BaseShape {

    @Override
    public void onSetup(Context context, Paint shapePaint) {}

    @Override
    public void onDraw(Canvas canvas, int x, int y, float radiusSize, int color, int rippleIndex, Paint shapePaint) {
        shapePaint.setColor(color);
        canvas.drawCircle(x, y, radiusSize, shapePaint);
    }
}
