package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 练习内容：使用 canvas.drawCircle() 方法画圆
        // 一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        int width = getWidth();
        int height = getHeight();

        Paint paint = new Paint();
        paint.setAntiAlias(true);

        // 确定四个圆的圆心横坐标
        float[] XPositions = {
                width / 4f,
                3 * width / 4f,
                width / 4f,
                3 * width / 4f};

        // 确定四个圆的圆心纵坐标
        float[] YPositions = {
                height / 4f,
                height / 4f,
                3 * height / 4f,
                3 * height / 4f};

        // 确定圆的半径
        float radius = height / 5f;

        // 画第一个圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(XPositions[0], YPositions[0], radius, paint);

        // 画第二个圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        canvas.drawCircle(XPositions[1], YPositions[1], radius, paint);

        // 画第三个圆
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(XPositions[2], YPositions[2], radius, paint);

        // 画第四个圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(40);
        canvas.drawCircle(XPositions[3], YPositions[3], radius, paint);
    }
}
