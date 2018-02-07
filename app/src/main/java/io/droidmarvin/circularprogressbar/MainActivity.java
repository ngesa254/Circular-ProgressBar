package io.droidmarvin.circularprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.rey.material.widget.ProgressView;

public class MaterialDesignAndroidCircularProgress extends AppCompatActivity {

    ProgressView circularProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material_design_circular_progressbar);

        circularProgressBar = (ProgressView) findViewById(R.id.circular_progress);
        circularProgressBar = (ProgressView) findViewById(R.id.circular_progress1);
        circularProgressBar = (ProgressView) findViewById(R.id.circular_progress2);
    }
}