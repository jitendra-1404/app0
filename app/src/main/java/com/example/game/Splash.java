package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView img = findViewById(R.id.lod);
        Animation ani = AnimationUtils.loadAnimation(this,R.anim.rotate);
        img.startAnimation(ani);
        Intent ient = new Intent(this,login.class);

       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(ient);
                finish();
            }
        }, 4000);

    }
}