package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view){
        TextView firstName = findViewById(R.id.txtViewFirstName);
        TextView lastName = findViewById(R.id.txtViewLastName);
        TextView email = findViewById(R.id.txtViewEmail);
        EditText userFirstName = findViewById(R.id.firstName);
        EditText userLastName = findViewById(R.id.lastName);
        EditText userEmail = findViewById(R.id.email);

        firstName.setText("First Name: " + userFirstName.getText().toString());
        lastName.setText("Last Name: " + userLastName.getText().toString());
        email.setText("Email: " + userEmail.getText().toString());
    }
}