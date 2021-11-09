package com.example.asg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class quiz extends AppCompatActivity {

    List<String> ques=new ArrayList<String>();
    List<String> opt=new ArrayList<String>();
    TextView qs;
    RadioButton op1,op2,op3,op4;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        ques.add("FROM WHICH PORTION OF MOUTH ل SOUND IS PRODUCED");
        ques.add("FROM WHICH PORTION OF MOUTH ک SOUND IS PRODUCED");
        opt.add("Rounded tip of the tongue touching the base of the frontal 8 teeth");
        opt.add("Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
        opt.add("Tongue touching center of mouth roof");
        opt.add("behind the uvula");
        opt.add("Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
        opt.add("Tongue touching center of mouth roof");
        opt.add("Portion of Tongue near its base touching the roof of mouth");
        opt.add("Base of tougue which is near uvula");
        qs=(TextView) findViewById(R.id.ques);
        submit=(Button) findViewById(R.id.submitBtn);
        qs.setText(ques.get(0));

        op1=(RadioButton) findViewById(R.id.opt1);
        op2=(RadioButton) findViewById(R.id.opt2);
        op3=(RadioButton) findViewById(R.id.opt3);
        op4 =(RadioButton) findViewById(R.id.opt4);

        op1.setText(opt.get(0));
        op2.setText(opt.get(1));
        op3.setText(opt.get(2));
        op4.setText(opt.get(3));
        for(int i=0;i<2;i++){
            qs.setText(ques.get(i));
            op1.setText(opt.get(0+i*4));
            op2.setText(opt.get(1+i*4));
            op3.setText(opt.get(2+i*4));
            op4.setText(opt.get(3+i*4));
        }


    }
}