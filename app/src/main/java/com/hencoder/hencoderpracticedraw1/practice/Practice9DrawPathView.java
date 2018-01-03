package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 练习内容：使用 canvas.drawPath() 方法画心形

        int width = getWidth();
        int height = getHeight();

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        Path path = new Path();

        // 确定两个圆的位置
        RectF leftRectF = new RectF(4 * width / 10, 2 * height / 5, 5 * width / 10, 2 * height / 5 + width / 10);
        RectF rightRectF = new RectF(5 * width / 10, 2 * height / 5, 6 * width / 10, 2 * height / 5 + width / 10);

        path.addArc(leftRectF, -225, 225);
        path.arcTo(rightRectF, -180, 225,false);
        path.lineTo(5 * width / 10, 2 * height / 5 + 2 * width / 10);

        canvas.drawPath(path, paint);
    }
}
