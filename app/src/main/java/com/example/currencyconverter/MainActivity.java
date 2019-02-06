package com.example.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    public void convertCurrency(View view){

        //Linking variables to layout
        EditText editTextAmount = findViewById(R.id.editTextAmount);
        TextView textViewConverted = findViewById(R.id.textViewConverted);


        //Getting the text for the layout
        String amountInDollars = editTextAmount.getText().toString();

        //Changing the amount we got from a string to a double
        double doubleAmount = Double.parseDouble(amountInDollars);

        //Formula for convert in dollars to euro's
        double convertedAmount = doubleAmount * 0.879701d;

        //Converting number to string and rounding to 2 decimal places
        String numberAsString = String.format("%.2f", convertedAmount);



        textViewConverted.setText("EUR " + numberAsString);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
