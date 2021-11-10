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

        tq.setText(tq.getText().toString());
        ca.setText(ca.getText().toString());
        wa.setText(String.valueOf(wrong));
        String m=tq.getText().toString()+"/"+ca.getText().toString();
        marks.setText(m);

    }
}