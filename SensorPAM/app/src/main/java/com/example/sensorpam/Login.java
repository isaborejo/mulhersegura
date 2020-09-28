package com.example.sensorpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button entrar = (Button) findViewById(R.id.entrar);
        entrar.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                TextView login = (TextView) findViewById(R.id.login);
                TextView senha = (TextView) findViewById(R.id.senha);
                String Login = login.getText().toString();
                String Senha = senha.getText().toString();
                if (Login.equals("isa") && Senha.equals("123")) {
                    Intent intent = new Intent(Login.this, Principal.class);
                    startActivity(intent);

                } else {
                    alert("Username ou senha incorretos!");
                }
            }

            private void alert(String a) {
                Toast.makeText(Login.this, a, Toast.LENGTH_LONG).show();
            }

        })
    ;}
}

