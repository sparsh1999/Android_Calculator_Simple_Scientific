package com.example.sparsh.mr_calculator;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class Scientific_Calculator extends AppCompatActivity {



    Button sub,add,one,two,three,four,five,six,seven,eight,nine,nega,multi,divi,clear,res,zero,dot,back,open,close,sin,cos,tan,log,ln,expo;
    EditText et2,et3;

    private EditText e1,e2;
    private int count=0;
    private String expression="";
    private String text="";
    private Double result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific__calculator);
        setTitle("Scientific Calculator");

        Resources r = getResources();
        Configuration config = r.getConfiguration();
        if(config.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            setIntent(null);
            Intent i = new Intent("MrSimpleCalculator");
            startActivity(i);
        }

        sin = findViewById(R.id.s_sin);
        cos = findViewById(R.id.s_cos);
        tan = findViewById(R.id.s_tan);
        log = findViewById(R.id.s_log);
        ln = findViewById(R.id.s_ln);
        sub = findViewById(R.id.s_min);
        add = findViewById(R.id.s_add);
        two = findViewById(R.id.s_2);
        one = findViewById(R.id.s_1);
        three = findViewById(R.id.s_3);
        four = findViewById(R.id.s_4);
        five = findViewById(R.id.s_5);
        six = findViewById(R.id.s_6);
        seven = findViewById(R.id.s_7);
        eight = findViewById(R.id.s_8);
        nine = findViewById(R.id.s_9);
        zero = findViewById(R.id.s_0);
        multi = findViewById(R.id.s_multi);
        divi = findViewById(R.id.s_divi);
        clear = findViewById(R.id.s_clea);
        et2 = findViewById(R.id.se2);
        et3=findViewById(R.id.se3);
        res= findViewById(R.id.s_res);
        dot = findViewById(R.id.s_dot);
        back = findViewById(R.id.s_back);
        open = findViewById(R.id.s_open);
        close = findViewById(R.id.s_close);
        expo = findViewById(R.id.s_expo);

    }

    public void onPress(View v)
    {
        String sample="";
        switch (v.getId()) {
            case R.id.s_0: {
                sample = et2.getText().toString() + zero.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_1: {
                sample = et2.getText().toString() + one.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_2: {
                sample = et2.getText().toString() + two.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_3: {
                sample = et2.getText().toString() + three.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_4: {
                sample = et2.getText().toString() + four.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_5: {
                sample = et2.getText().toString() + five.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_6: {
                sample = et2.getText().toString() + six.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_7: {
                sample = et2.getText().toString() + seven.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_8: {
                sample = et2.getText().toString() + eight.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_9: {
                sample = et2.getText().toString() + nine.getText().toString();
                et2.setText(sample);
                break;
            }
            case R.id.s_add: {
                sample = et2.getText().toString()+" + ";
                count=0;
                et2.setText(sample);
                break;
            }
            case R.id.s_min: {
                sample = et2.getText().toString()+" - ";
                et2.setText(sample);
                count=0;
                break;
            }
            case R.id.s_multi: {
                sample = et2.getText().toString()+" * ";
                et2.setText(sample);
                count=0;
                break;
            }
            case R.id.s_divi: {
                sample = et2.getText().toString()+" / ";
                et2.setText(sample);
                count=0;
                break;
            }
            case R.id.s_clea: {
                et2.setText(null);
                et3.setText(null);
                break;
            }

            case R.id.s_dot: {
               if(count==1)
               {}
               else {
                   sample = et2.getText().toString() + dot.getText().toString();
                   et2.setText(sample);
               }
                break;
            }
            case R.id.s_res:
                if(et2.length()!=0)
                {
                    expression=et2.getText().toString();
                }
                et2.setText("");
                if(expression.length()==0)
                    expression="0.0";
                DoubleEvaluator evaluator = new DoubleEvaluator();
                try
                {

                    result=new Evaluator().evaluate(expression);
                    if(!expression.equals("0.0"))

                        et3.setText(result+"");
                }
                catch (Exception e)
                {
                    et3.setText("Invalid Expression");
                    et2.setText("");
                    expression="";
                    e.printStackTrace();
                }
                break;

               case R.id.s_open:
                et2.setText(et2.getText()+" ( ");
                break;

                case R.id.s_close:
                    et2.setText(et2.getText()+" ) ");
                break;

                case R.id.s_sin:
                    et2.setText(et2.getText()+" sin( ");
                break;

                case R.id.s_cos:
                    et2.setText(et2.getText()+" cos( ");
                break;

                case R.id.s_tan:
                    et2.setText(et2.getText()+" tan( ");
                break;

            case R.id.s_log:
                et2.setText(et2.getText()+" log( ");
                break;

            case R.id.s_ln:
                et2.setText(et2.getText()+" ln( ");
                break;

            case R.id.s_pie:
                et2.setText(et2.getText()+" pi");
                break;

            case R.id.s_expo:
            {
                sample =et2.getText().toString()+" ^ ";
                et2.setText(sample);
                break;
            }
            case R.id.s_e:
                et2.setText(et2.getText()+" e");
                break;
            case R.id.sqrt:
                if(et2.length()!=0)
                {
                    text=et2.getText().toString();
                    et2.setText(text+" sqrt (" );
                }
                break;

            case R.id.square:
                if(et2.length()!=0)
                {
                    text=et2.getText().toString();
                    et2.setText(text+"^2");
                }
                break;
            case R.id.s_back:
                text=et2.getText().toString();
                if(text.length()>0)
                {
                    if(text.endsWith("."))
                    {
                        count=0;
                    }
                    String newText=text.substring(0,text.length()-1);

                    et2.setText(newText);
                }
                break;


        }
    }

}
