package com.example.luism.eventlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button)findViewById(R.id.btn);

        //find button and assign to variable
        Button btn2 = (Button)findViewById(R.id.btn2);



        //button on click two code
        btn2.setOnClickListener(
                new Button.OnClickListener(){
                   public void onClick(View v){
                       TextView textView2 = (TextView)findViewById(R.id.textView2);
                       textView2.setText(" I made it.");
                   }
                }
        );






        btn.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setText("Lets go Luis!!..");
                    }
                }
        );


        btn.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setText("That was a long one.");
                        return true;
                    }
                }
        );






    }
}
