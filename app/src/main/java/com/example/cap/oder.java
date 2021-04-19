package com.example.cap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class oder extends AppCompatActivity {
    TextView textViewHello;
    CheckBox checkBoxMilk;
    CheckBox checkBoxSugar;
    CheckBox checkBoxLemon;
    Spinner spinnerTea;
    Spinner spinnerCoffee;
    String drink;
    StringBuilder add;
    String name;
    String fullText;
    String typeOfDrink;
    StringBuilder additions=new StringBuilder();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder);
        textViewHello=findViewById(R.id.textViewHello);
        spinnerCoffee=findViewById(R.id.spinnerCoffe);
        spinnerTea= findViewById(R.id.spinnerTea);
        checkBoxLemon=findViewById(R.id.checkBoxLemon);
        checkBoxSugar=findViewById(R.id.checkBoxSugar);
        checkBoxMilk=findViewById(R.id.checkBoxMilk);
        Intent intent=getIntent();
        name=intent.getStringExtra("name");
        fullText=String.format("Hello %s what kind of drink do you want?",name);
        textViewHello.setText(fullText);





    }

    public void chooseDrink(View view) {
        RadioButton button=(RadioButton)view;
        int id=button.getId();
        if (id==R.id.radioButtonTea){
            drink="Tea";
            spinnerTea.setVisibility(View.VISIBLE);
            spinnerCoffee.setVisibility(View.INVISIBLE);
        }else {
            drink="Coffee";
            spinnerTea.setVisibility(View.INVISIBLE);
            spinnerCoffee.setVisibility(View.VISIBLE);
        }
    }

    public void sentOder(View view) {


        if(drink.equals("Tea")){
            typeOfDrink=spinnerTea.getSelectedItem().toString();

        }else{
            typeOfDrink=spinnerCoffee.getSelectedItem().toString();
        }
        if(checkBoxMilk.isChecked()){
            additions.append("Milk").append("  ");
        }
        if(checkBoxLemon.isChecked()){
            additions.append("Lemon").append("  ");
        }
        if(checkBoxSugar.isChecked()){
            additions.append("Sugar").append("  ");
        }
        String result=String.format("Client %s make the oder %s, with %s and type is %s",name,drink,additions.toString(),typeOfDrink);

        Log.d("result",result);



    }
}
