package com.example.asg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class learnActivity extends AppCompatActivity {

    ImageView img,img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        img=(ImageView) findViewById(R.id.learnImg);
        img1=(ImageView) findViewById(R.id.learnImg2);
        Bundle bundle=getIntent().getExtras();
        int picid=bundle.getInt("picid");
        int picid1=bundle.getInt("picid1");
        img.setImageResource(picid);
        img1.setImageResource(picid1);

    }
}