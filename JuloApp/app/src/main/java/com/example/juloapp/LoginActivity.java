package com.example.juloapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.juloapp.databinding.ActivityConnectionBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityConnectionBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConnectionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(binding.mail.getText()).equals("") && !(binding.pass.getText().equals(""))){
                    if((String.valueOf(binding.mail.getText())).equals("jules.aubry@gmail.com") && (String.valueOf(binding.pass.getText()).equals("123456789"))){
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

    }
}
