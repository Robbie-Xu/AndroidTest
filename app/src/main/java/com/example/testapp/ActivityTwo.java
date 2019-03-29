package com.example.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void BtnClick(View view){
        EditText editText = (EditText)findViewById(R.id.editText);
        String string = editText.getText().toString();
        Toast.makeText(this,string,Toast.LENGTH_SHORT).show();
    }
}
