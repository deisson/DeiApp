package com.example.deiapp;

import android.content.Context;
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

        int[] sets = {R.attr.artistText, R.attr.trackText, R.attr.buyButton};
        TypedArray typedArray = context.obtainStyledAttributes(attrs, sets);
        CharSequence artist = typedArray.getText(index0);
        CharSequence track = typedArray.getText(index1);
        CharSequence buyButton = typedArray.getText(index2);
        typedArray.recycle();

        initComponents();

        setInitTextView(artist);
        setEndTextView(track);
        setButton(buyButton);
    }

    private void initComponents() {
        initTextView = (TextView) findViewById(R.id.artist_Text);

        endTextView = (TextView) findViewById(R.id.track_Text);

        buyButton = (Button) findViewById(R.id.buy_Button);
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

    public CharSequence getButton() {
        return buyButton.getText();
    }

    public void setButton(CharSequence value) {
        buyButton.setText(value);
    }
}
