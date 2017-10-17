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
    Paint mPaint;
    private Paint mPaint1,mPaint2;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);

        mPaint1 = new Paint();
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint1.setColor(Color.YELLOW);
        mPaint1.setAntiAlias(true);

        mPaint2 = new Paint();
        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setColor(Color.BLACK);
        mPaint2.setStrokeWidth(1);
        mPaint2.setAntiAlias(true);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int l = getWidth() / 4;
        int t = getHeight() / 6;
//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        RectF oval=new RectF(0, 0, 300, 300);
        canvas.drawOval(oval,mPaint2);
        canvas.drawArc(oval,0,90,true,mPaint);
        canvas.drawArc(oval,0,90,false,mPaint1);


        RectF oval1=new RectF(350, 150, 800, 450);
        canvas.drawOval(oval1,mPaint2);
        canvas.drawArc(oval1,-10,-100,true,mPaint);

        canvas.drawArc(oval1,20,140,false,mPaint);
    }
}
