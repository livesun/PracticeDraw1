package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {
    Paint mPaint;
    private String src="直方图";
    private int interval=30;
    private int mWidth=80;
    private Random mRandom;
    private String [] mStrings=new String[]{"Frayq","GB","ICS","JB","KiKata","L","M"};
    private Paint mPaint1;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(5);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(50);

        mRandom = new Random();

        mPaint1 = new Paint();
        mPaint1.setColor(Color.WHITE);
        mPaint1.setAntiAlias(true);
        mPaint1.setTextSize(30);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int x=100;
        int width = getWidth();
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //text高度
        Rect bounds= new Rect();
        mPaint1.getTextBounds(mStrings[0],0,mStrings[0].length(),bounds);
        int textHeight = bounds.bottom - bounds.top;


        canvas.drawLine(x,500,x,30,mPaint);
        canvas.drawLine(x,500,width-x,500,mPaint);
        for(int i=0;i<7;i++){
            RectF rect=new RectF(x+(mWidth+interval)*(i+1)-mWidth,mRandom.nextInt(400),x+(mWidth+interval)*(i+1),500);
            canvas.drawRect(rect,mPaint);
            //text宽度
            float textWidth = (x + (mWidth + interval) * (i + 1)-mWidth + mWidth / 2) - mPaint1.measureText(mStrings[i]) / 2;
            canvas.drawText(mStrings[i],textWidth,500+textHeight,mPaint1);
        }

        canvas.drawText(src,width/2-mPaint.measureText(src)/2,getHeight()-50,mPaint);
    }
}
