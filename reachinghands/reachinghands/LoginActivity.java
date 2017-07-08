package com.cfg.reachinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    Button mLogin, mSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Reaching Hands");
        getSupportActionBar().setSubtitle("Login");

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.login:
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                Toast.makeText(this, "Log In successful!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.signup:
                
        }
    }
}
