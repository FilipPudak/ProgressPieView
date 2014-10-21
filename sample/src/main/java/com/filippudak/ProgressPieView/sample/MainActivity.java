package com.filippudak.ProgressPieView.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import com.filippudak.ProgressPieView.ProgressPieView;

public class MainActivity extends ActionBarActivity {

    private static final int SIZE = 96;
    private static final int MARGIN = 8;

    private SeekBar mSeekBar;
    private ProgressPieView mProgressPieView;
    private ProgressPieView mProgressPieViewInverted;
    private ProgressPieView mProgressPieViewXml;
    private ProgressPieView mProgressPieViewCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        // Code version
        float density = getResources().getDisplayMetrics().density;
        int size = (int) (density * SIZE);
        int margin = (int) (density * MARGIN);
        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        mProgressPieViewCode = new ProgressPieView(this);
        final LinearLayout.LayoutParams layoutParams
                = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1);
        layoutParams.gravity = Gravity.CENTER;
        layoutParams.setMargins(margin, margin, margin, margin);
        mProgressPieViewCode.setLayoutParams(layoutParams);
        mProgressPieViewCode.setText("Code");
        mProgressPieViewCode.setTextSize(22);
        mProgressPieViewCode.setTextColor(getResources().getColor(R.color.holo_orange_light));
        mProgressPieViewCode.setBackgroundColor(getResources().getColor(R.color.holo_red_dark));
        mProgressPieViewCode.setProgressColor(getResources().getColor(R.color.holo_green_dark));
        mProgressPieViewCode.setStrokeColor(getResources().getColor(R.color.holo_blue_dark));
        mProgressPieViewCode.setTypeface("fonts/Roboto/Roboto-Italic.ttf");
        mProgressPieViewCode.setStartAngle(720);
        container.addView(mProgressPieViewCode);

        // Default version
        mProgressPieView = (ProgressPieView) findViewById(R.id.progressPieView);
        mProgressPieView.setOnProgressListener(new ProgressPieView.OnProgressListener() {
            @Override
            public void onProgressChanged(int progress, int max) {
                if (!mProgressPieView.isTextShowing()) {
                    mProgressPieView.setShowText(true);
                    mProgressPieView.setShowImage(false);
                }
            }

            @Override
            public void onProgressCompleted() {
                if (!mProgressPieView.isImageShowing()) {
                    mProgressPieView.setShowImage(true);
                }
                mProgressPieView.setShowText(false);
                mProgressPieView.setImageResource(R.drawable.ic_action_accept);
            }
        });

        // Inverted default version
        mProgressPieViewInverted = (ProgressPieView) findViewById(R.id.progressPieViewInverted);

        // XML version
        mProgressPieViewXml = (ProgressPieView) findViewById(R.id.progressPieViewXml);

        // SeekBar 
        mSeekBar = (SeekBar) findViewById(R.id.seekbar);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mProgressPieView.setProgress(i);
                mProgressPieView.setText(i + "%");
                mProgressPieViewInverted.setProgress(i);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_item_animate) {
            mProgressPieView.setProgress(0);
            mProgressPieView.animateProgressFill();
            mProgressPieViewInverted.setProgress(0);
            mProgressPieViewInverted.animateProgressFill();
            mProgressPieViewXml.setProgress(0);
            mProgressPieViewXml.animateProgressFill();
            mProgressPieViewCode.setProgress(0);
            mProgressPieViewCode.animateProgressFill();
        }
        return super.onOptionsItemSelected(item);
    }
}
