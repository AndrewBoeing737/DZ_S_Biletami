package com.example.dz_s_biletami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button kypit;
EditText name;
EditText surname;
EditText from;
EditText to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kypit=findViewById(R.id.button);
        name=findViewById(R.id.editTextTextPersonName);
        surname=findViewById(R.id.editTextTextPersonName2);
        from=findViewById(R.id.editTextTextPersonName3);
        to=findViewById(R.id.editTextTextPersonName4);
        kypit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                Bilet bilet= (Bilet) new Bilet(name.getText().toString(),surname.getText().toString(),from.getText().toString(),to.getText().toString());
                intent.putExtra("Bilet",bilet);
                startActivity(intent);

            }
        });

    }
}