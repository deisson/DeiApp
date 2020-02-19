package com.example.deiapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.StyleableRes;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Component421 extends ConstraintLayout {

    @StyleableRes
    int index0 = 0;
    @StyleableRes
    int index1 = 1;
    @StyleableRes
    int index2 = 2;

    TextView titleView;
    SeekBar seekBarView;
    TextView initTextView;
    TextView endTextView;

    public Component421(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        inflate(context, R.layout.custom_component, this);

        int[] sets = {R.attr.titleText, R.attr.initText, R.attr.endText};
        TypedArray typedArray = context.obtainStyledAttributes(attrs, sets);
        CharSequence title = typedArray.getText(index0);
        CharSequence init = typedArray.getText(index1);
        CharSequence end = typedArray.getText(index2);
        typedArray.recycle();

        initComponents();

        setTilteTextView(title);
        setInitTextView(init);
        setEndTextView(end);
    }

    private void initComponents() {
        titleView = (TextView) findViewById(R.id.title);
        seekBarView = (SeekBar) findViewById(R.id.simpleSeekBar);
        initTextView = (TextView) findViewById(R.id.initText);
        endTextView = (TextView) findViewById(R.id.endText);
    }

    public CharSequence getTitleTextView() {
        return titleView.getText();
    }

    public void setTilteTextView(CharSequence value) {
        titleView.setText(value);
    }

    public CharSequence getInitTextView() {
        return initTextView.getText();
    }

    public void setInitTextView(CharSequence value) {
        initTextView.setText(value);
    }

    public CharSequence getEndTextView() {
        return endTextView.getText();
    }

    public void setEndTextView(CharSequence value) {
        endTextView.setText(value);
    }
}
