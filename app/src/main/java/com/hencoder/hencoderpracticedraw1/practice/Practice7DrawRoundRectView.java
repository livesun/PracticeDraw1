package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {
    Paint mPaint;
    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int l = getWidth() / 4;
        int t = getHeight() / 6;
//        练习内容：使用 canvas.drawRect() 方法画矩形
        RectF r=new RectF(l,t*2,l*3,t*4);
//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        canvas.drawRoundRect(r,50,50,mPaint);
    }
}
