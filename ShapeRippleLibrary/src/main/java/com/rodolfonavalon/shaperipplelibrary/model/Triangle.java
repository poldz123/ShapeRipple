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
import android.graphics.Path;

public class Triangle extends BaseShape {

    private Path path;

    @Override
    public void onSetup(Context context, Paint shapePaint) {
        path = new Path();
    }

    @Override
    public void onDraw(Canvas canvas, int x, int y, float radiusSize, int color, int rippleIndex, Paint shapePaint) {

        //TODO: need to improve performance due to drawing to canvas

        int mY = (y - (int) radiusSize);
        int rX = (x - (int) radiusSize);
        int lX = (x + (int) radiusSize);
        int bY = (y + (int) radiusSize);

        path.moveTo(x,  mY);
        path.lineTo(rX, bY);
        path.lineTo(lX, bY);
        path.close();
        shapePaint.setColor(color);
        canvas.drawPath(path, shapePaint);
        path.reset();

    }
}
