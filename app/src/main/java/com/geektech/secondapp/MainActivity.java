package com.geektech.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText gmail;
    private EditText password;
    private Button button;
    private TextView makeOut,registerName,enter;
    private  TextView forgetPassword,click,forget;


    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gmail = findViewById(R.id.gmail);
        password = findViewById(R.id.password);
        button = findViewById(R.id.btn_go);
        makeOut=findViewById(R.id.make_out);
        registerName=findViewById(R.id.register_name);
        enter=findViewById(R.id.enter);
        forgetPassword= findViewById(R.id.register_name);
        click=findViewById(R.id.clicke);
        forget= findViewById(R.id.forget_password);




        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (gmail.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));

                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (password.getText().toString().isEmpty()) {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.gray));
                } else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }

            }
        });
        button.setOnClickListener(v -> {
            if (gmail.getText().toString().equals("admin")&& password.getText().toString().equals("admin")){
                makeOut.setVisibility(View.GONE);
                registerName.setVisibility(View.GONE);
                enter.setVisibility(View.GONE);
                forgetPassword.setVisibility(View.GONE);
                click.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                password.setVisibility(View.GONE);
                gmail.setVisibility(View.GONE);
                forget.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались.", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Неверный логин и пароль.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}