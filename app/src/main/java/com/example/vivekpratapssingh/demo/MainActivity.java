package com.example.vivekpratapssingh.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btntoast, btnplus, btnsub,btnreset;
    private TextView txt;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.result);
        btntoast = findViewById(R.id.toast);
        btnplus = findViewById(R.id.Plus);
        btnsub = findViewById(R.id.sub);
        btnreset = findViewById(R.id.reset);

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"HELLO!!!!",Toast.LENGTH_SHORT).show();

            }
        });

       btnplus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
          count=count+1;
          txt.setText(""+count);
           }
       });

      btnsub.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if (btnsub.isClickable())
              {
                  if (count>0){
                      count =count -1;
                      txt.setText(""+count);
                  }
                  else
                      Toast.makeText(MainActivity.this, "please Not Decrement", Toast.LENGTH_SHORT).show();
              }
          }
      });
      btnreset.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              count=0;
              txt.setText(""+count);
         }
      });






    }

}