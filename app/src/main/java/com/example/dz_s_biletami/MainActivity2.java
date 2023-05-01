package com.example.dz_s_biletami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        name.setText("Имя: "+bilet.getName().toString());
        surname=findViewById(R.id.textView2);
        surname.setText("Фамилия: "+bilet.getSurname().toString());
        from=findViewById(R.id.textView3);
        from.setText("Город отправления: "+bilet.getFrom().toString());
        to=findViewById(R.id.textView4);
        to.setText("Город прибытия: "+bilet.getTo().toString());


    }
}