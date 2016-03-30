package com.example.aneta.musiclighter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Aneta on 2016-03-30.
 */
public class LighterView extends View {
    public LighterView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x = getWidth();
        int y = getHeight();
        int radius;
        if (y > x) {
            radius = x / 2;
        } else {
            radius = y / 2;
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        // Use Color.parseColor to define HTML colors
        paint.setColor(Color.parseColor("#fb705d"));
        canvas.drawCircle(x / 2, y / 2, radius, paint);
    }
}
