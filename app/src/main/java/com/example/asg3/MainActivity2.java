package com.example.asg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button halqiyah,lesaviyah,lahatiyah,sh,tarfiyah,nit,ghunna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        halqiyah=(Button) findViewById(R.id.button7);
        lesaviyah=(Button) findViewById(R.id.button2);
        lahatiyah=(Button) findViewById(R.id.button6);
        sh=(Button) findViewById(R.id.button4);
        tarfiyah=(Button) findViewById(R.id.button5);
        nit=(Button) findViewById(R.id.button3);
        ghunna=(Button) findViewById(R.id.button);
        halqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,learnActivity.class);
                intent.putExtra("picid",R.drawable.halqiyah);
                intent.putExtra("picid1",R.drawable.halqiyah1);
                startActivity(intent);
            }
        });
        lesaviyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,learnActivity.class);
                intent.putExtra("picid",R.drawable.ls);
                intent.putExtra("picid1",R.drawable.ls1);
                startActivity(intent);
            }
        });
        lahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,learnActivity.class);
                intent.putExtra("picid",R.drawable.lahatiyah);
                intent.putExtra("picid1",R.drawable.lahatiyah1);
                startActivity(intent);
            }
        });
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,learnActivity.class);
                intent.putExtra("picid",R.drawable.sh);
                intent.putExtra("picid1",R.drawable.sh1);
                startActivity(intent);
            }
        });
        nit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,learnActivity.class);
                intent.putExtra("picid",R.drawable.nit);
                intent.putExtra("picid1",R.drawable.nit1);
                startActivity(intent);
            }
        });
        tarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,learnActivity.class);
                intent.putExtra("picid",R.drawable.tarfiyah);
                intent.putExtra("picid1",R.drawable.tarfiyah1);
                startActivity(intent);
            }
        });
        ghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,learnActivity.class);
                intent.putExtra("picid",R.drawable.ghunna);
                intent.putExtra("picid1",R.drawable.ghunna1);
                startActivity(intent);
            }
        });
    }
}