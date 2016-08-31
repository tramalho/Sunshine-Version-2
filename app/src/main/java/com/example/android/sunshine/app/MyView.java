package com.example.android.sunshine.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import static android.os.Build.VERSION_CODES.LOLLIPOP;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(LOLLIPOP)
    public MyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        widthMeasureSpec  = getDimen(widthMeasureSpec);
        heightMeasureSpec = getDimen(heightMeasureSpec);

        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }

    private int getDimen(int dimen) {
        int mode = MeasureSpec.getMode(dimen);
        int size = MeasureSpec.getSize(dimen);
        int finalDimen = dimen;

        return finalDimen;
    }
}
