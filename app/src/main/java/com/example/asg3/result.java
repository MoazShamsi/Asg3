package com.example.asg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView tq,ca,wa,marks,percentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tq=(TextView)findViewById(R.id.tq);
        ca=(TextView)findViewById(R.id.ca);
        wa=(TextView)findViewById(R.id.wa);
        marks=(TextView)findViewById(R.id.marks);
        percentage=(TextView)findViewById(R.id.perc);
        Bundle bundle=getIntent().getExtras();
        int total=bundle.getInt("totalQues");
        int correct=bundle.getInt("correctAns");
        int wrong=total-correct;

        tq.setText(String.valueOf(total));
        ca.setText(String.valueOf(correct));
        wa.setText(String.valueOf(wrong));
        String m=String.valueOf(total)+"/"+String.valueOf(correct);
        marks.setText(m);
        int per=(correct/total)*100;
        percentage.setText(String.valueOf(per));

    }
}