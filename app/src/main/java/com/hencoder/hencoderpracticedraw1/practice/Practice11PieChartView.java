package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 综合练习
        // 练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int width = getWidth();
        int height = getHeight();

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        float radius = 2 * height / 5;
        float deviation = 30;
        float xDeviation = (float) Math.abs((deviation * Math.sin(85)));
        float yDeviation = (float) Math.abs((deviation * Math.cos(85)));
        RectF oval1 = new RectF(width / 2 - radius + xDeviation, height / 2 - radius - yDeviation, width / 2 + radius + xDeviation, height / 2 + radius - yDeviation);
        RectF oval2 = new RectF(width / 2 - radius, height / 2 - radius, width / 2 + radius, height / 2 + radius);

        paint.setColor(Color.RED);
        canvas.drawArc(oval1, -160f, 150f, true, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(oval2, -10f, 100f, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(oval2, 92f, 58f, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(oval2, 152f, 48f, true, paint);
    }
}
