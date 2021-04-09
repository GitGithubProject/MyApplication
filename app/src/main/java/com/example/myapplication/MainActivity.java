package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit1, edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProcess = (Button)findViewById(R.id.btnProcess);

        btnProcess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddValue();
            }
        });

        //create references for the edittext
//        edit1 = findViewById(R.id.editText);
//        edit2 = findViewById(R.id.editText2);
    }

    private void AddValue() {
        edit1 =(EditText) findViewById(R.id.editText);
        edit2 =(EditText) findViewById(R.id.editText2);

        TextView resultTextView = (TextView)findViewById(R.id.resultTextView);
        //read numeric values from edits
        double v1 = Double.parseDouble(edit1.getText().toString());
        double v2 = Double.parseDouble(edit2.getText().toString());
        //process
        double total = v1+v2;

        resultTextView.setText(total + " ");
    }

    protected void addValues(View v){
        //read numeric values from edits
        double v1 = Double.parseDouble(edit1.getText().toString());
        double v2 = Double.parseDouble(edit2.getText().toString());
        //process
        double total = v1+v2;
        //display
        Toast.makeText(getApplicationContext(),
                v1+" + " + v2 + " = " + total,

                Toast.LENGTH_LONG).show();
    }


}
