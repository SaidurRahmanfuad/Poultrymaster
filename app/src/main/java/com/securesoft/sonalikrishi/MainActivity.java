package com.securesoft.sonalikrishi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar mProgress;
    ImageView splashlogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgress = (ProgressBar) findViewById(R.id.splash_screen_progress_bar);

        splashlogo =findViewById(R.id.splash_logo);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_id);
        splashlogo.startAnimation(myFadeInAnimation);

        // Start lengthy operation in a background thread
        new Thread(new Runnable() {
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();
    }

    private void doWork() {
        for (int progress=0; progress<50; progress+=10) {
            try {
                Thread.sleep(300);
                mProgress.setProgress(progress);
            } catch (Exception e) {
                e.printStackTrace();
               // Timber.e(e.getMessage());
            }
        }
    }

    private void startApp() {
        Intent intent = new Intent(MainActivity.this, Home.class);
        startActivity(intent);
    }
}