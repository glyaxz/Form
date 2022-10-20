package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CharSequence strUser, strName, strDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creacion de Variables
        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtName = findViewById(R.id.txtName);
        EditText txtarea = findViewById(R.id.txtareaDesc);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        Button btnClear = findViewById(R.id.btnCancel);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strUser = txtUser.getText();
                strName = txtName.getText();
                strDesc = txtarea.getText();
                Usuario var = new Usuario(strName.toString(), strUser.toString(), strDesc.toString());
                Toast.makeText(MainActivity.this, var.toString(), Toast.LENGTH_SHORT).show();
                clearFields(txtUser, txtName, txtarea);

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                clearFields(txtUser, txtName, txtarea);
            }
        });

    }
    public void clearFields(EditText a, EditText b, EditText c){
        a.setText(null);
        b.setText(null);
        c.setText(null);
    }

}