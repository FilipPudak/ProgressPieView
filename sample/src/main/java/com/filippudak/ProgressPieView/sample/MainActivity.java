package com.filippudak.ProgressPieView.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import com.filippudak.ProgressPieView.ProgressPieView;


public class MainActivity extends ActionBarActivity {

    private static final int SIZE = 96;
    private static final int MARGIN = 8;

    private SeekBar mSeekBar;
    private ProgressPieView mProgressPieView;
    private ProgressPieView mProgressPieViewXml;
    private ProgressPieView mProgressPieViewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        float density = getResources().getDisplayMetrics().density;
        int size = (int) (density * SIZE);
        int margin = (int) (density * MARGIN);

        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        mProgressPieViewCode = new ProgressPieView(this);
        final LinearLayout.LayoutParams layoutParams
                = new LinearLayout.LayoutParams(size, size);
        layoutParams.gravity = Gravity.CENTER_HORIZONTAL;
        layoutParams.setMargins(margin, margin, margin, margin);
        mProgressPieViewCode.setLayoutParams(layoutParams);
        mProgressPieViewCode.setText("Code");
        mProgressPieViewCode.setTextSize(22);
        mProgressPieViewCode.setTextColor(getResources().getColor(R.color.holo_orange_light));
        mProgressPieViewCode.setBackgroundColor(getResources().getColor(R.color.holo_red_dark));
        mProgressPieViewCode.setProgressColor(getResources().getColor(R.color.holo_green_dark));
        mProgressPieViewCode.setStrokeColor(getResources().getColor(R.color.holo_blue_dark));
        mProgressPieViewCode.setTypeface("fonts/Roboto/Roboto-Italic.ttf");

        container.addView(mProgressPieViewCode);

        mSeekBar = (SeekBar) findViewById(R.id.seekbar);
        mProgressPieView = (ProgressPieView) findViewById(R.id.progressPieView);
        mProgressPieView.setOnProgressListener(new ProgressPieView.OnProgressListener() {
            @Override
            public void onProgressChanged(int progress, int max) {

            }

            @Override
            public void onProgressCompleted() {
                mProgressPieView.setShowText(false);
                mProgressPieView.setImageResource(R.drawable.ic_action_accept);
            }
        });
        mProgressPieViewXml = (ProgressPieView) findViewById(R.id.progressPieViewXml);

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mProgressPieView.setProgress(i);
                mProgressPieView.setText(i + "%");
                mProgressPieViewXml.setProgress(i);
                mProgressPieViewCode.setProgress(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



    }
}
