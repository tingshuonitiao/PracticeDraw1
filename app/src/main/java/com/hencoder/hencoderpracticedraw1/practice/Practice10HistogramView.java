package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 综合练习
        // 练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        int width = getWidth();
        int height = getHeight();

        Paint paint = new Paint();
        paint.setAntiAlias(true);


        // 画坐标轴
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        Path path = new Path();
        path.moveTo(width / 10, height / 10);
        path.lineTo(width / 10, 7 * height / 10);
        path.lineTo(9 * width / 10, 7 * height / 10);
        canvas.drawPath(path, paint);

        // 画直方图
        float interval = width / 20;        // 直方图之间的间隔
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(width / 10 + interval, 6 * height / 10, width / 10 + interval + width / 5, 7 * height / 10 - 2, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawRect(width / 10 + 2 * interval + width / 5, 4 * height / 10, width / 10 + 2 * interval + 2 * width / 5, 7 * height / 10 - 2, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(width / 10 + 3 * interval + 2 * width / 5, 2 * height / 10, width / 10 + 3 * interval + 3 * width / 5, 7 * height / 10 - 2, paint);

        // 画文字
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);
        String red = "red";
        String yellow = "yellow";
        String green = "green";
        float redWidth = paint.measureText(red);
        float yellowWidth = paint.measureText(yellow);
        float greenWidth = paint.measureText(green);
        canvas.drawText(red, width / 10 + interval + width / 10 - redWidth / 2, 7 * height / 10 + 50f, paint);
        canvas.drawText(yellow, width / 10 + 2 * interval + width / 10 - yellowWidth / 2 + width / 5, 7 * height / 10 + 50f, paint);
        canvas.drawText(green, width / 10 + 3 * interval + width / 10 - greenWidth / 2 + 2 * width / 5, 7 * height / 10 + 50f, paint);

        paint.setTextSize(70);
        String text = "直方图";
        float textWidth = paint.measureText(text);
        canvas.drawText(text, width / 2 - textWidth / 2, 9 * height / 10, paint);
    }
}
