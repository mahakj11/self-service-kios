[10:53] NIDHI NEVREKAR - 70522200068
package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main4);

Button getStartedButton = findViewById(R.id.getStartedButton);

getStartedButton.setOnClickListener(new View.OnClickListener() {
@Override

public void onClick(View v) {

Intent intent = new Intent(MainActivity4.this, MainActivity.class);

startActivity(intent);

}

});

}

}
