package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creacion de Variables
        CharSequence strUser, strName, strDesc;
        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtName = findViewById(R.id.txtName);
        EditText txtarea = findViewById(R.id.txtareaDesc);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        Button btnClear = findViewById(R.id.btnCancel);


    }
}