package com.example.submarines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    BoardGame bg;
    FrameLayout frame;
    Button showHideBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        frame = findViewById(R.id.frame);
        bg = new BoardGame(this);
        frame.addView(bg);
         showHideBtn=(Button) findViewById(R.id.showHide);
         showHideBtn.setOnClickListener(this);


    }
    public void retry(View view)
    {
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
        bg.showHideSubs();
    }
}
