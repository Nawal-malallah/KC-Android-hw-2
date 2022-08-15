package com.example.hw_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText name = findViewById(R.id.Name);
        EditText age = findViewById(R.id.age);
        EditText job = findViewById(R.id.job);
        EditText num = findViewById(R.id.number);
        EditText email = findViewById(R.id.email);

        Bundle b = getIntent().getExtras();

        String namee = b.getString("gn");
        name.setText(namee);

        int agee = b.getInt("ga");
        age.setText(String.valueOf(agee));

        String jobb = b.getString("gj");
        job.setText(jobb);

        int numm = b.getInt("gn");
        num.setText(String.valueOf(numm));

        String emaill = b.getString("ge");
        email.setText(emaill);
    }
}