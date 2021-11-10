package com.example.asg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class quiz extends AppCompatActivity {

    boolean clicked=false;
    int i=0;
    List<String> ques=new ArrayList<String>();
    List<String> opt=new ArrayList<String>();
    List<String> answers=new ArrayList<String>();
    TextView qs,display;
    RadioGroup rg;
    RadioButton op1,op2,op3,op4,ans;
    Button submit,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //QUESTIONS
        ques.add("FROM WHICH PORTION OF MOUTH ل SOUND IS PRODUCED?");
        ques.add("FROM WHICH PORTION OF MOUTH ک SOUND IS PRODUCED?");
        ques.add("FROM WHICH PORTION OF MOUTH م SOUND IS PRODUCED?");
        ques.add("WHICH OF THE FOLLOWING LETTER BELONGS TO HALQIYAH GROUP?");
        ques.add("WHICH OF THE FOLLOWING LETTER BELONGS TO LAHATIYAH GROUP?");
        //OPTIONS
        opt.add("Rounded tip of the tongue touching the base of the frontal 8 teeth");
        opt.add("Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
        opt.add("Tongue touching center of mouth roof");
        opt.add("behind the uvula");
        answers.add("Rounded tip of the tongue touching the base of the frontal 8 teeth");

        opt.add("Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
        opt.add("Tongue touching center of mouth roof");
        opt.add("Portion of Tongue near its base touching the roof of mouth");
        opt.add("Base of tougue which is near uvula");
        answers.add("Portion of Tongue near its base touching the roof of mouth");

        opt.add("Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth");
        opt.add("Outer part of both lips touch each other");
        opt.add("Portion of Tongue near its base touching the roof of mouth");
        opt.add("Base of tougue which is near uvula");
        answers.add("Outer part of both lips touch each other");

        opt.add("ع");
        opt.add("ل");
        opt.add("ک");
        opt.add("م");
        answers.add("ع");

        opt.add("ع");
        opt.add("ل");
        opt.add("م");
        opt.add("ک");
        answers.add("ک");

        qs=(TextView) findViewById(R.id.ques);
        display=(TextView) findViewById(R.id.anstv);
        submit=(Button) findViewById(R.id.submitBtn);
        next=(Button) findViewById(R.id.next);

        op1=(RadioButton) findViewById(R.id.opt1);
        op2=(RadioButton) findViewById(R.id.opt2);
        op3=(RadioButton) findViewById(R.id.opt3);
        op4 =(RadioButton) findViewById(R.id.opt4);

        rg=(RadioGroup) findViewById(R.id.radioGroup);


       unknown(i);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<5)
                {
                    i++;
                    if(i!=5){
                    unknown(i);
                    if(i==4)
                    {next.setText("END");}
                    display.setText("");}
                    else
                    {

                    }

                }


            }

        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=rg.getCheckedRadioButtonId();
                ans=(RadioButton) findViewById(id);
                String check=ans.getText().toString();
                String check1=answers.get(i).toString();
                if(check==check1){
                    display.setText("TRUE ANSWER");
                }
                else
                {
                    display.setText("WRONG ANSWER");
                }
            }

        });




    }
    public void unknown(int x)
    {
        qs.setText(ques.get(x));
        op1.setText(opt.get(0+x*4));
        op2.setText(opt.get(1+x*4));
        op3.setText(opt.get(2+x*4));
        op4.setText(opt.get(3+x*4));

    }
}