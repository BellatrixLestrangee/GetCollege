package com.example.bellatrix.getcollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button loginstudent = (Button) findViewById(R.id.button);
        loginstudent.setBackgroundDrawable(getResources().getDrawable(R.drawable.something));

        loginstudent.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent name= new Intent(Main2Activity.this,StudentLogin.class);
                                           startActivity(name);
                                            }});

        Button loginfaculty = (Button) findViewById(R.id.button2);
        loginfaculty.setBackgroundDrawable(getResources().getDrawable(R.drawable.something));

        loginfaculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent name= new Intent(Main2Activity.this,FacultyLogin.class);
                startActivity(name);
            }});

        Button signin = (Button) findViewById(R.id.button3);
        signin.setBackgroundDrawable(getResources().getDrawable(R.drawable.something));
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });

    }
}
