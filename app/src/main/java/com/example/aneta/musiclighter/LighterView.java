package com.example.aneta.musiclighter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
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
        int screenWidth = getWidth();
        int screenHeight = getHeight();

        int lighterCenterX = screenWidth/2;          // <-
        int lighterHeight = screenHeight*2/5;
        int lighterWidth = lighterHeight/3;

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawPaint(paint);
        // Use Color.parseColor to define HTML colors
        paint.setColor(Color.parseColor("#fb705d"));

        int left = lighterCenterX - lighterWidth/2;
        int top = screenHeight - lighterHeight;          // <-
        int right = lighterCenterX + lighterWidth/2;
        int bottom = screenHeight;
        canvas.drawRect(left, top, right, bottom, paint);

        int flameW = screenWidth/8;  // <-
        int flameH = screenHeight/6;  // <-

        int flameLeft = lighterCenterX-flameW/5;
        int flameTop = flameH;
        int flameRight = lighterCenterX+flameW/5;
        int flameBottom = flameH+screenHeight/3;
        paint.setColor(Color.parseColor("#ff8000"));
        RectF flame = new RectF(flameLeft, flameTop, flameRight, flameBottom);
        canvas.drawOval(flame, paint);
    }
}
