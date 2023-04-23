package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    TextView txt;
    int flag_w=0,flag=0,count=0;
    String p1,p2,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = getIntent();
        p1 = intent.getStringExtra("pl1") ;
        p2 = intent.getStringExtra("pl2") ;
        init();

    }

    @SuppressLint("SetTextI18n")
    public void init(){
        btn1= findViewById(R.id.bt1);
        btn2= findViewById(R.id.bt2);
        btn3= findViewById(R.id.bt3);
        btn4= findViewById(R.id.bt4);
        btn5= findViewById(R.id.bt5);
        btn6= findViewById(R.id.bt6);
        btn7= findViewById(R.id.bt7);
        btn8= findViewById(R.id.bt8);
        btn9= findViewById(R.id.bt9);
        txt= findViewById(R.id.text);
        txt.setText(p1+"'s Turn");
    }

    public void chk(View v){

        Button b = (Button) v;
        if (b.getText()=="" && flag_w!=1){
            count++;
            if (flag==0){
                b.setText("O");
                txt.setText(p2+"'s Turn");
                flag=1;
            }else {
                b.setText("X");
                txt.setText(p1+"'s Turn");
                flag=0;
            }

            if (count>4){
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2)  && b2.equals(b3) && !b3.equals("")){
                    flag_w=1;
                    if (b1.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (b4.equals(b5)  && b5.equals(b6) && !b6.equals("")){
                    flag_w=1;
                    if (b4.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (b7.equals(b8)  && b8.equals(b9) && !b9.equals("")){
                    flag_w=1;
                    if (b7.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (b1.equals(b4)  && b4.equals(b7) && !b7.equals("")){
                    flag_w=1;
                    if (b1.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (b2.equals(b5)  && b5.equals(b8) && !b8.equals("")){
                    flag_w=1;
                    if (b2.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (b3.equals(b6)  && b6.equals(b9) && !b9.equals("")){
                    flag_w=1;
                    if (b3.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (b1.equals(b5)  && b5.equals(b9) && !b9.equals("")){
                    flag_w=1;
                    if (b1.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (b3.equals(b5)  && b5.equals(b7) && !b7.equals("")){
                    flag_w=1;
                    if (b3.equals("O")) txt.setText(p1+" Won the Game");
                    else txt.setText(p2+" Won the Game");
                } else if (count==9) {
                    txt.setText("It's a Draw");
                }
            }
        }

    }

    public void reset(View v){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        txt.setText(p1+"'s Turn");
        count=0;
        flag=0;
        flag_w=0;
    }

}