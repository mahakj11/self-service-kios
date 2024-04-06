[10:55] NIDHI NEVREKAR - 70522200068
package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;

import android.widget.Button;

import android.content.Intent;

public class MainActivity extends AppCompatActivity {
@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

// Initialize the checkboxes and button

CheckBox chkChowmein = findViewById(R.id.chkChowmein);

CheckBox chkPizza = findViewById(R.id.chkPizza);

CheckBox chkPasta = findViewById(R.id.chkPasta);

CheckBox chkNachos = findViewById(R.id.chkNachos);

CheckBox chkMojito = findViewById(R.id.chkMojito);

CheckBox chkOreoShake = findViewById(R.id.chkOreoShake);

Button btnForward = findViewById(R.id.btnForward);

// Set a click listener for the button

btnForward.setOnClickListener(new View.OnClickListener() {
@Override

public void onClick(View v) {

// Calculate the total amount

int totalAmount = 0;

if (chkChowmein.isChecked()) {

totalAmount += 250;

}

if (chkPizza.isChecked()) {

totalAmount += 380;

}

if (chkPasta.isChecked()) {

totalAmount += 290;

}

if (chkNachos.isChecked()) {

totalAmount += 300;

}

if (chkMojito.isChecked()) {

totalAmount += 300;

}

if (chkOreoShake.isChecked()) {

totalAmount += 300;

}

Intent intent = new Intent(MainActivity.this, MainActivity2.class);

intent.putExtra("Total_AMOUNT",totalAmount);

startActivity(intent);

}

});

}

}
