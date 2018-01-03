package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        int width = getWidth();
        int height = getHeight();

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);

        paint.setStyle(Paint.Style.FILL);
        RectF oval = new RectF(width / 3, 4 * height / 10, 2 * width / 3, 6 * height / 10);
        canvas.drawArc(oval, 0f, -100f, true, paint);
        canvas.drawArc(oval, -190f, -130f, false, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(oval, -110f, -65f, false, paint);
    }
}
