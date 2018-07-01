package com.example.sparsh.mr_calculator;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SimpleCalculator extends Activity implements View.OnClickListener {

    Button sub,add,one,two,three,four,five,six,seven,eight,nine,nega,multi,divi,clear,res,zero,dot,back;
    EditText et1,et2,et3,et4;
    double firstnumber,secondnumber;
    Double d=0.0;
    int count=0;
    Double outcome =0.0;
    int operation=0;
    int final_value=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        setTitle("Scientific Calculator");
        Resources r = getResources();
        Configuration config = r.getConfiguration();
        if(config.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            setIntent(null);
            Intent i = new Intent("MrScientificCalculator");
            startActivity(i);
        }

        sub = findViewById(R.id.b_sub);
        add = findViewById(R.id.b_add);
        two = findViewById(R.id.bt2);
        one = findViewById(R.id.bt1);
        three = findViewById(R.id.bt3);
        four = findViewById(R.id.bt4);
        five = findViewById(R.id.bt5);
        six = findViewById(R.id.bt6);
        seven = findViewById(R.id.bt7);
        eight = findViewById(R.id.bt8);
        nine = findViewById(R.id.bt9);
        zero = findViewById(R.id.bt0);
        multi = findViewById(R.id.b_multi);
        divi = findViewById(R.id.b_divi);
        clear = findViewById(R.id.clea);
        et1= findViewById(R.id.e1);
        et2 = findViewById(R.id.e2);
        et3=findViewById(R.id.e3);
        et4 = findViewById(R.id.e4);
        res= findViewById(R.id.b_res);
        nega=findViewById(R.id.b_nega);
        dot = findViewById(R.id.b_dot);
        back = findViewById(R.id.backspace);

        dot.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        nega.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        clear.setOnClickListener(this);
        res.setOnClickListener(this);
        back.setOnClickListener(this);
        et4.setFocusable(true);
        et4.requestFocus();
    }

    public void onClick(View v)
    {

        String sample;

        String s;
        // 1 add , 2 sub , 3 multiply ,4 divide


        switch (v.getId())
        {
            case R.id.bt1: {
                sample = et3.getText().toString() + one.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt2: {
                sample = et3.getText().toString() + two.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt3: {
                sample = et3.getText().toString() + three.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt4: {
                sample = et3.getText().toString() + four.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt5: {
                sample = et3.getText().toString() + five.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt6: {
                sample = et3.getText().toString() + six.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt7: {
                sample = et3.getText().toString() + seven.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt8: {
                sample = et3.getText().toString() + eight.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);jump(v.getId(),v);
                break;
            }
            case R.id.bt9: {
                sample = et3.getText().toString() + nine.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.bt0: {
                sample = et3.getText().toString() + zero.getText().toString();
                et3.setText(sample);
                result(et1,et3,et4,operation);
                jump(v.getId(),v);
                break;
            }
            case R.id.clea:
            {
                et2.setText(null);
                et1.setText(null);
                et3.setText(null);
                et4.setText(null);
                count =0;
                break;
            }
            case R.id.b_divi: {
                if (et1.getText().toString().length()==0&&et3.getText().toString().length()==0&&et4.getText().toString().length()==0)
                {}
                else {
                    et1.setText(et4.getText().toString());
                    jump(v.getId(),v);
                    et2.setText("/");

                    et3.setText(null);
                    count = 0;
                    operation =4;
                }
                break;
            }
            case R.id.b_add: {
                if (et1.getText().toString().length()==0&&et3.getText().toString().length()==0&&et4.getText().toString().length()==0)
                {}
                else {
                    et1.setText(et4.getText().toString());
                    jump(v.getId(),v);
                    et2.setText("+");

                    et3.setText(null);
                    count = 0;
                    operation =1;
                }
                break;
            }
            case R.id.b_sub: {
                if (et1.getText().toString().length()==0&&et3.getText().toString().length()==0&&et4.getText().toString().length()==0)
                {}
                else {
                    et1.setText(et4.getText().toString());
                    jump(v.getId(),v);
                    et2.setText("-");

                    et3.setText(null);
                    count = 0;
                    operation =2;
                }
                break;
            }
            case R.id.b_multi: {
                if (et1.getText().toString().length()==0&&et3.getText().toString().length()==0&&et4.getText().toString().length()==0)
                {}
                else {
                    et1.setText(et4.getText().toString());
                    jump(v.getId(),v);
                    et2.setText("*");

                    et3.setText(null);
                    count = 0;
                    operation =3;
                }
                break;
            }
            case R.id.b_res: {
                if ((et1.length()==0&&et3.length()==0))
                {}
                else {
                    et4.setTextSize(22);
                    Typeface boldTypeface = Typeface.defaultFromStyle(Typeface.BOLD);
                    et4.setTypeface(boldTypeface);
                    final_value = 1;
                }
                break;
            }
            case R.id.b_nega: {
                d = Double.parseDouble(et3.getText().toString());
                d = d*(-1);
                et4.setText(String.valueOf(d));
                break;
            }
            case R.id.b_dot: {
                if (count == 0 && et3.length() != 0 ) {
                    et3.setText(et3.getText().toString()+".");
                    count++;
                }
                break;
            }
            case R.id.backspace:
            {
                EditText e = (EditText) getCurrentFocus();
                if (e.length()!=0)
                {
                    if (e.getText().toString().endsWith("."))
                    {
                        count=0;
                    }
                    String y = e.getText().toString().substring(0,e.getText().length()-1);
                    e.setText(y);
                }
            }

        }

    }


    public void result(EditText ft1, EditText ft3,EditText ft4,int x)
    {
        if (ft1.length()==0&&ft3.length()==0)
        {

        }
        if (ft1.length()!=0&&ft3.length()==0)
        {
            ft4.setText(String.valueOf(outcome));
        }
        if (ft1.length()==0&&ft3.length()!=0)
        {
            ft4.setText(ft3.getText().toString());
        }
        if (ft1.length()!=0&&ft3.length()!=0)
        {

            firstnumber = Double.parseDouble(ft1.getText().toString());
            secondnumber = Double.parseDouble(ft3.getText().toString());
            if (x==0)
            {}
            else if (x==1)
            {outcome = firstnumber+secondnumber;}
            else if (x==2)
            {outcome = firstnumber-secondnumber;}
            else if (x==3)
            {outcome = firstnumber*secondnumber;}
            else if (x==4)
            {outcome = firstnumber/secondnumber;}
            System.out.print(outcome);
            ft4.setText(String.valueOf(outcome));
        }
    }
    public void jump (int a,View V)
    {

        if (final_value==1 && (a==R.id.b_divi ||a==R.id.b_add || a==R.id.b_multi || a==R.id.b_sub ))
        {
            final_value=0;
            count++;
            Typeface boldTypeface = Typeface.defaultFromStyle(Typeface.NORMAL);
            et4.setTypeface(boldTypeface);
            et4.setTextSize(20);
            V.setId(a);
            onClick(V);
        }
        else if (final_value==1)
        {
            V.setId(R.id.clea);
            final_value=0;
            count++;
            Typeface boldTypeface = Typeface.defaultFromStyle(Typeface.NORMAL);
            et4.setTypeface(boldTypeface);
            et4.setTextSize(20);
            onClick(V);
            V.setId(a);
            onClick(V);
        }

    }

}

