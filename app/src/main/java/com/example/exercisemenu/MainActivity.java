package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnok;
    EditText editUN,editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnok=(Button) findViewById(R.id.btnok);
        editUN=(EditText)findViewById(R.id.editUN);
        editPass=(EditText)findViewById(R.id.editPass);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editUN.getText().toString().equals("admin")&&
                editPass.getText().toString().equals("123")){
                    Toast.makeText(getApplicationContext(),"Pasword Benar",
                            Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(i);
                }else {
                    Toast.makeText(getApplicationContext(), "Password salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
