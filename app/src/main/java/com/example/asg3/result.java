package com.example.asg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {

    TextView tq,ca,wa,marks,percentage;
    Button result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tq=(TextView)findViewById(R.id.tq);
        ca=(TextView)findViewById(R.id.ca);
        wa=(TextView)findViewById(R.id.wa);
        marks=(TextView)findViewById(R.id.marks);
        percentage=(TextView)findViewById(R.id.perc);
        result=(Button) findViewById(R.id.share);
        Bundle bundle=getIntent().getExtras();
        int t=bundle.getInt("totalQ");
        int c=bundle.getInt("correct");
        int w=t-c;

        tq.setText(String.valueOf(t));
        ca.setText(String.valueOf(c));
        wa.setText(String.valueOf(w));
        String m=String.valueOf(t)+"/"+String.valueOf(c);
        marks.setText(m);
        double per=((double) c/(double) t);
        per=per*100;
        percentage.setText(String.valueOf(per));

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}