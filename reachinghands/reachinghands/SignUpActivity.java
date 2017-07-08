package com.cfg.reachinghands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText mUserName,mUserEmail,mPassword,mConfirmPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Reaching Hands");
        getSupportActionBar().setSubtitle("SignUp");

        Intent intent1=getIntent();
        mUserName =(EditText)findViewById(R.id.p1);
        mUserEmail=(EditText)findViewById(R.id.p2);
        mPassword=(EditText)findViewById(R.id.editText3);
        mConfirmPass=(EditText)findViewById(R.id.editText4);

    }
    public void signup1(View view)
    {
        String ll=mUserName.getText().toString();
        String l2=mUserEmail.getText().toString();
        String ll1=mPassword.getText().toString();
        String ll2=mConfirmPass.getText().toString();

        if( !ll.equals(l2))
        {
            Toast.makeText(SignUpActivity.this,"passwords do not match", Toast.LENGTH_LONG).show();
        }
        else{
            //Toast.makeText(Main3Activity.this,"added",Toast.LENGTH_SHORT).show();

            startActivity(new Intent(SignUpActivity.this, MainActivity.class));
            Toast.makeText(SignUpActivity.this,"Logged In!",Toast.LENGTH_SHORT).show();

        }

    }
}
