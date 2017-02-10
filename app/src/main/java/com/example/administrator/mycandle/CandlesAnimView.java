package com.example.administrator.mycandle;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/12/23 0023.
 */

public class CandlesAnimView extends View {

    private final static int WIDTH_DEFAULT = 180;
    private final static int HEIGHT_DEFAULT = 150;
    private int mDensity;
    private boolean mIsInit = false;

    public CandlesAnimView(Context context) {
        super(context);
    }

    public CandlesAnimView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CandlesAnimView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mDensity = (int) getResources().getDisplayMetrics().density;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = measureDimension(WIDTH_DEFAULT * mDensity, widthMeasureSpec);
        int height = measureDimension(HEIGHT_DEFAULT * mDensity, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }

    public int measureDimension(int defaultSize, int measureSpec){
        int result;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.EXACTLY){
            result = specSize;
        }else {
            result = defaultSize;
            if (specMode == MeasureSpec.AT_MOST){
                result = Math.min(result, specSize);
            }
        }
        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
