package com.example.cap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);

    }

    public void oder(View view) {
        String name=editText.getText().toString().trim();
        if(!name.isEmpty()){
        Intent intent=new Intent(this,oder.class);
        intent.putExtra("name",name);

        startActivity(intent);}
        else {
            Toast.makeText(this,"Enter your name",Toast.LENGTH_SHORT).show();

        }

    }
}
