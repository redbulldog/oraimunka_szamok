package com.example.sunsolutions003.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button novekvo;
    private Button csokkeno;
    private Button visszaallit;
    private TextView szam;
    public int i = 0;
    public int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novekvo = (Button) findViewById(R.id.Novekvo);
        csokkeno = (Button) findViewById(R.id.Csokkeno);
        visszaallit = (Button) findViewById(R.id.Reset);
        szam = (TextView) findViewById(R.id.textView);



        novekvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                click++;
                szam.setText(Integer.toString(i));
                Toast toast = Toast.makeText(getApplicationContext(), "Unatkozol??", Toast.LENGTH_SHORT);
                if (click==20){
                    toast.show();
                    click=0;
                }

            }

        });
        csokkeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                click++;
                szam.setText(Integer.toString(i));
                Toast toast = Toast.makeText(getApplicationContext(), "Unatkozol??", Toast.LENGTH_SHORT);
                if (click==20){
                    toast.show();
                    click=0;
                }
            }
        });
        visszaallit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 0;
                szam.setText("0");
            }
        });



    }
}
