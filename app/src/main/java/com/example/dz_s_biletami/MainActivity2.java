package com.example.dz_s_biletami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView name ;
TextView surname;
TextView from;
TextView to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle=getIntent().getExtras();
        Bilet bilet=(Bilet)bundle.getSerializable("Bilet");
        name= findViewById(R.id.textView);
        name.setText("ID: "+bilet.id.toString());
        surname=findViewById(R.id.textView2);
        surname.setText("Стоимость : "+bilet.stoimost.toString());
        from=findViewById(R.id.textView3);
        from.setText("Место: "+bilet.mesto.toString());
        to=findViewById(R.id.textView4);
        to.setText("Время отправления: "+bilet.vremya_otpravlenia.toString()+", время прибытия :"+bilet.vremua_prybytia.toString());
        Button  OAuth=findViewById(R.id.button2);
        OAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}