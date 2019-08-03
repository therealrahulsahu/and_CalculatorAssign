package com.example.kiit.calculatorassign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1,b2,b3,b4,b5,b6,cb1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.badd);
        b2=findViewById(R.id.bsub);
        b3=findViewById(R.id.bmul);
        b4=findViewById(R.id.bdiv);
        b5=findViewById(R.id.bpow);
        b6=findViewById(R.id.bper);
        et1=findViewById(R.id.op1);
        et2=findViewById(R.id.op2);
        t1=findViewById(R.id.tv1);
        cb1=findViewById(R.id.bnext);

     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float a=Float.parseFloat(et1.getText().toString());
             float b=Float.parseFloat(et2.getText().toString());
             float c = a + b;
             t1.setText("" + c);

         }
     });
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float a=Float.parseFloat(et1.getText().toString());
             float b=Float.parseFloat(et2.getText().toString());
             float c=a-b;
             t1.setText(""+c);
         }
     });
     b3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float a=Float.parseFloat(et1.getText().toString());
             float b=Float.parseFloat(et2.getText().toString());
             float c=a*b;
             t1.setText(""+c);
         }
     });
     b4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             float a=Float.parseFloat(et1.getText().toString());
             float b=Float.parseFloat(et2.getText().toString());
             if(b==0)
                 t1.setText("Can't divide by zero");
             else
             {
                 float c=a/b;
                 t1.setText(""+c);
             }

         }
     });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(et1.getText().toString());
                double b=Double.parseDouble(et2.getText().toString());
                double c=Math.pow(a,b);
                t1.setText(""+c);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(et1.getText().toString());
                float b=Float.parseFloat(et2.getText().toString());
                if(b==0)
                    t1.setText("Can't divide by zero");
                else
                {
                    float c=(a/b)*100;
                    t1.setText(""+c+"%");
                }

            }
        });
    cb1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s=t1.getText().toString();
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("message",s);
            startActivity(intent);
        }
    });


    }
}
