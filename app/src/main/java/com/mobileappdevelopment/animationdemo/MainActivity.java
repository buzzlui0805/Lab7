package com.mobileappdevelopment.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Animation.AnimationListener{
    Animation animFadeIn;
    Animation animFadeOut;
    Animation animFadeInOut;

    Animation animZoomIn;
    Animation animZoomOut;

    Animation animLeftRight;
    Animation animRightLeft;
    Animation animTopBottom;

    Animation animBounce;
    Animation animFlash;

    Animation animRotateLeft;
    Animation animRotateRight;

    ImageView imageView;
    TextView textView;

    Button btnFadeIn;
    Button btnFadeOut;
    Button btnFadeInOut;
    Button zoomIn;
    Button zoomOut;
    Button leftRight;
    Button rightLeft;
    Button topBottom;
    Button bounce;
    Button flash;
    Button rotateLeft;
    Button rotateRight;
    SeekBar seekBarSpeed;
    TextView tvSeekBarSpeed;
    int seekSpeedProgress;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadAnimations();
        loadUI();

    }

    private void loadAnimations(){
        animFadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animFadeIn.setAnimationListener(this);

        animFadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        animFadeOut.setAnimationListener(this);

        animFadeInOut = AnimationUtils.loadAnimation(this,R.anim.fade_in_out);
        animFadeInOut.setAnimationListener(this);

        animZoomIn = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        animZoomOut = AnimationUtils.loadAnimation(this,R.anim.zoom_out);

        animLeftRight = AnimationUtils.loadAnimation(this,R.anim.left_right);
        animRightLeft = AnimationUtils.loadAnimation(this,R.anim.right_left);
        animTopBottom = AnimationUtils.loadAnimation(this,R.anim.top_bot);

        animBounce = AnimationUtils.loadAnimation(this,R.anim.bounce);
        animFlash = AnimationUtils.loadAnimation(this,R.anim.flash);

        animRotateLeft = AnimationUtils.loadAnimation(this,R.anim.rotate_left);
        animRotateRight = AnimationUtils.loadAnimation(this,R.anim.rotate_right);
    }

    private void loadUI(){
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnFadeOut = findViewById(R.id.btnFadeOut);
        btnFadeInOut = findViewById(R.id.btnFadeInOut);
        zoomIn = findViewById(R.id.btnZoomIn);
        zoomOut = findViewById(R.id.btnZoomOut);
        leftRight = findViewById(R.id.btnLeftRight);
        rightLeft = findViewById(R.id.btnRightLeft);
        topBottom = findViewById(R.id.btnTopBottom);
        bounce = findViewById(R.id.btnBounce);
        flash = findViewById(R.id.btnFlash);
        rotateLeft = findViewById(R.id.btnRotateLeft);
        rotateRight = findViewById(R.id.btnRotateRight);

        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnFadeInOut.setOnClickListener(this);
        zoomIn.setOnClickListener(this);
        zoomOut.setOnClickListener(this);
        leftRight.setOnClickListener(this);
        rightLeft.setOnClickListener(this);
        topBottom.setOnClickListener(this);
        bounce.setOnClickListener(this);
        flash.setOnClickListener(this);
        rotateLeft.setOnClickListener(this);
        rotateRight.setOnClickListener(this);

        seekBarSpeed = findViewById(R.id.seekBarSpeed);
        tvSeekBarSpeed = findViewById(R.id.tvSeekBarSpeed);

        seekBarSpeed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int value, boolean fromUser) {
                seekSpeedProgress = value;
                tvSeekBarSpeed.setText(
                        "" + seekSpeedProgress + " of " + seekBarSpeed.getMax()
                );
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
    public void onClick(View v) {
        if(v.getId() == R.id.btnFadeIn){
            animFadeIn.setDuration(seekSpeedProgress);
            animFadeIn.setAnimationListener(this);
            imageView.startAnimation(animFadeIn);
        }
        else if(v.getId() == R.id.btnFadeOut){
            animFadeOut.setDuration(seekSpeedProgress);
            animFadeOut.setAnimationListener(this);
            imageView.startAnimation(animFadeOut);
        }
        else if(v.getId() == R.id.btnFadeInOut){
            animFadeInOut.setDuration(seekSpeedProgress);
            animFadeInOut.setAnimationListener(this);
            imageView.startAnimation(animFadeInOut);
        }
        else if(v.getId() == R.id.btnZoomIn){
            animZoomIn.setDuration(seekSpeedProgress);
            animZoomIn.setAnimationListener(this);
            imageView.startAnimation(animZoomIn);
        }
        else if(v.getId() == R.id.btnZoomOut){
            animZoomOut.setDuration(seekSpeedProgress);
            animZoomOut.setAnimationListener(this);
            imageView.startAnimation(animZoomOut);
        }
        else if(v.getId() == R.id.btnLeftRight){
            animLeftRight.setDuration(seekSpeedProgress);
            animLeftRight.setAnimationListener(this);
            imageView.startAnimation(animLeftRight);
        }
        else if(v.getId() == R.id.btnRightLeft){
            animRightLeft.setDuration(seekSpeedProgress);
            animRightLeft.setAnimationListener(this);
            imageView.startAnimation(animRightLeft);
        }
        else if(v.getId() == R.id.btnTopBottom){
            animTopBottom.setDuration(seekSpeedProgress);
            animTopBottom.setAnimationListener(this);
            imageView.startAnimation(animTopBottom);
        }
        else if(v.getId() == R.id.btnBounce){
            animBounce.setDuration(seekSpeedProgress);
            animBounce.setAnimationListener(this);
            imageView.startAnimation(animBounce);
        }
        else if(v.getId() == R.id.btnFlash){
            animFlash.setDuration(seekSpeedProgress);
            animFlash.setAnimationListener(this);
            imageView.startAnimation(animFlash);
        }
        else if(v.getId() == R.id.btnRotateLeft){
            animRotateLeft.setDuration(seekSpeedProgress);
            animRotateLeft.setAnimationListener(this);
            imageView.startAnimation(animRotateLeft);
        }
        else if(v.getId() == R.id.btnRotateRight){
            animRotateRight.setDuration(seekSpeedProgress);
            animRotateRight.setAnimationListener(this);
            imageView.startAnimation(animRotateRight);
        }
    }

    @Override
    public void onAnimationStart(Animation animation) {
        textView.setText("RUNNING");

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        textView.setText("STOPPED");
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}