package com.larsnyborgpedersen.hardrockguitarsolomaker;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private MediaPlayer song = new MediaPlayer();
    private MediaPlayer guitarLick = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu();
        playHardRock();
        initButtons();
    }

    public void menu(){
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // method invoked only when the actionBar is not null.
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }



    //When clicking picture, the song starts or stops
    public void pictureClicked (View view ){
        if (song==null){
            playHardRock();
        }
        else if (song!=null){
            stopHardRock();
        }
    }

    //Play hard rock song
    public void playHardRock() {
        song = MediaPlayer.create(MainActivity.this, R.raw.hardrock);
        song.start();

    }
    //Stop song
    public void stopHardRock() {
        if (song != null) {
            song.stop();
            song.release();
            song = null;
        }
    }
    //Stop guitar lick
    public void stopGuitarLick() {
        if (guitarLick != null) {
            guitarLick.stop();
            guitarLick.release();
            guitarLick = null;
        }
    }


    //Initialize buttons
    public void initButtons() {
        ImageButton b1 = (ImageButton) findViewById(R.id.button1);
        b1.setOnClickListener(this);
        ImageButton b2 = (ImageButton) findViewById(R.id.button2);
        b2.setOnClickListener(this);
        ImageButton b3 = (ImageButton) findViewById(R.id.button3);
        b3.setOnClickListener(this);
        ImageButton b4 = (ImageButton) findViewById(R.id.button4);
        b4.setOnClickListener(this);
        ImageButton b5 = (ImageButton) findViewById(R.id.button5);
        b5.setOnClickListener(this);
        ImageButton b6 = (ImageButton) findViewById(R.id.button6);
        b6.setOnClickListener(this);
        ImageButton b7 = (ImageButton) findViewById(R.id.button7);
        b7.setOnClickListener(this);
        ImageButton b8 = (ImageButton) findViewById(R.id.button8);
        b8.setOnClickListener(this);
        ImageButton b9 = (ImageButton) findViewById(R.id.button9);
        b9.setOnClickListener(this);
        ImageButton b10 = (ImageButton) findViewById(R.id.button10);
        b10.setOnClickListener(this);
        ImageButton b11 = (ImageButton) findViewById(R.id.button11);
        b11.setOnClickListener(this);
        ImageButton b12 = (ImageButton) findViewById(R.id.button12);
        b12.setOnClickListener(this);
        ImageButton b13 = (ImageButton) findViewById(R.id.button13);
        b13.setOnClickListener(this);
        ImageButton b14 = (ImageButton) findViewById(R.id.button14);
        b14.setOnClickListener(this);
        ImageButton b15 = (ImageButton) findViewById(R.id.button15);
        b15.setOnClickListener(this);
        ImageButton b16 = (ImageButton) findViewById(R.id.button16);
        b16.setOnClickListener(this);

    }

    //Helper method for onClick method
    public void guitarLickFunction(MediaPlayer x) {
        if (guitarLick!=null) {
            guitarLick.stop();
            guitarLick.release();
            guitarLick = null;
            guitarLick = x;
            guitarLick.start();
        } else
            guitarLick = x;
        guitarLick.start();
    }

    //Click on guitar licks buttons and then they will play
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button1:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s1));

                break;
            case R.id.button2:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s2));

                break;
            case R.id.button3:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s3));

                break;
            case R.id.button4:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s4));

                break;
            case R.id.button5:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s5));

                break;
            case R.id.button6:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s6));

                break;
            case R.id.button7:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s7));

                break;
            case R.id.button8:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s8));

                break;
            case R.id.button9:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s9));

                break;
            case R.id.button10:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s10));

                break;
            case R.id.button11:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s11));

                break;
            case R.id.button12:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s12));

                break;
            case R.id.button13:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s13));

                break;
            case R.id.button14:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s14));

                break;
            case R.id.button15:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s15));

                break;
            case R.id.button16:
                guitarLickFunction(MediaPlayer.create(MainActivity.this, R.raw.s16));

        }

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        stopHardRock();


        stopGuitarLick();
    }


    protected void onStop() {
        super.onStop();

        stopHardRock();

        stopGuitarLick();
    }
    protected void onRestart() {
        super.onRestart();
        playHardRock();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}