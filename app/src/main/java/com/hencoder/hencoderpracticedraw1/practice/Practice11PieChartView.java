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

    private Paint mLollipopPaint;
    private Paint mMarshmallowPaint;
    private Paint mFroyoPaint;
    private Paint mIcePaint;
    private Paint mJellyPaint;
    private Paint mKitKatPaint;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mLollipopPaint = getPaint(Color.parseColor("#EA422D"));
        mMarshmallowPaint = getPaint(Color.parseColor("#F9C100"));
        mFroyoPaint = getPaint(Color.parseColor("#9726B4"));
        mIcePaint = getPaint(Color.parseColor("#9E9E9E"));
        mJellyPaint = getPaint(Color.parseColor("#309688"));
        mKitKatPaint = getPaint(Color.parseColor("#4096F7"));
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private Paint getPaint(int color){
        Paint paint=new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        paint.setAntiAlias(true);
        return paint;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        RectF oval=new RectF(200,80,700,580);
        //圆形的点
        float rx=200+(700-200)/2;
        float ry=80+(580-80)/2;

        canvas.drawArc(oval,-60,-120,true,mLollipopPaint);
        canvas.translate(20,20);
        canvas.drawArc(oval,0,-60,true,mMarshmallowPaint);
        canvas.drawArc(oval,2,6,true,mFroyoPaint);
        canvas.drawArc(oval,10,6,true,mIcePaint);
        canvas.drawArc(oval,18,55,true,mJellyPaint);
        canvas.drawArc(oval,75,105,true,mKitKatPaint);

    }
}
