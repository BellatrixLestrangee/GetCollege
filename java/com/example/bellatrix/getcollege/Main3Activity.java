package com.example.bellatrix.getcollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // Spinner element
        EditText first_name= (EditText)findViewById(R.id.first_name);
        EditText last_name= (EditText)findViewById(R.id.last_name);
        EditText emailid_=(EditText)findViewById(R.id.email_id);
        EditText passwd1=(EditText)findViewById(R.id.pass_word);
        EditText passwd2= (EditText)findViewById(R.id.r_pass_word);
        RadioGroup rgroup=(RadioGroup)findViewById(R.id.radio_group_1);
        Spinner spinner = (Spinner) findViewById(R.id.spinnerlist);
        Button button_3=(Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent name= new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(name);
            }});
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Some Item");
        categories.add("Some more shit");
        categories.add("Some college");
        categories.add("Education");
        categories.add("Idk");
        categories.add("Add it yourself");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        // Spinner click listener
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


   // public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item


        // Showing selected spinner item
       // Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
  //  }

   // public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
  //  }
}

