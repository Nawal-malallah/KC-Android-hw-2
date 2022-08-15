package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.Name);
        EditText age = findViewById(R.id.age);
        EditText job = findViewById(R.id.job);
        EditText num = findViewById(R.id.number);
        EditText email = findViewById(R.id.email);

        Button bb = findViewById(R.id.button);

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String namee = name.getText().toString();
                int agee = Integer.parseInt(age.getText().toString());
                String jobb = job.getText().toString();
                int numm = Integer.parseInt(num.getText().toString());
                String emaill = email.getText().toString();

                Intent info = new Intent (MainActivity.this , MainActivity2.class);

                info.putExtra("gn" , namee);
                info.putExtra("ga" , agee);
                info.putExtra("gj" , jobb);
                info.putExtra("gn" , numm);
                info.putExtra("ge" , emaill);

              startActivity(info);
            }
        });
    }
}