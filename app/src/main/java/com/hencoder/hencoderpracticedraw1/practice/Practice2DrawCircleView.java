package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint mPaint1;
    private Paint mPaint2;
    private Paint mPaint3;
    private Paint mPaint4;
    public Practice2DrawCircleView(Context context) {
        this(context,null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint1 = new Paint();
        mPaint1.setAntiAlias(true);
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint1.setColor(Color.BLACK);

        mPaint2 = new Paint();
        mPaint2.setAntiAlias(true);
        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setColor(Color.BLACK);

        mPaint3 = new Paint();
        mPaint3.setAntiAlias(true);
        mPaint3.setStyle(Paint.Style.FILL);
        mPaint3.setColor(Color.BLUE);

        mPaint4 = new Paint();
        mPaint4.setAntiAlias(true);
        mPaint4.setStyle(Paint.Style.STROKE);
        mPaint4.setColor(Color.BLACK);
        mPaint4.setStrokeWidth(30);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(widthSize,heightSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        int r=Math.min(width/3/2,height/3/2);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        float cx1=width/3;
        float cy1=height/4;
        canvas.drawCircle(cx1,cy1,r,mPaint1);

        float cx2=width/3*2;
        float cy2=height/4;
        canvas.drawCircle(cx2,cy2,r,mPaint2);

        float cx3=width/3;
        float cy3=height/4*3;
        canvas.drawCircle(cx3,cy3,r,mPaint3);

        float cx4=width/3*2;
        float cy4=height/4*3;
        canvas.drawCircle(cx4,cy4,r,mPaint4);

    }
}
