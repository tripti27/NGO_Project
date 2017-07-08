package com.cfg.reachinghands;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("SIGNUP");
        Intent intent1=getIntent();
        pp1=(EditText)findViewById(R.id.p1);
        pp2=(EditText)findViewById(R.id.p2);
        k1=(EditText)findViewById(R.id.editText3);
        k2=(EditText)findViewById(R.id.editText4);

    }
    public void signup1(View view)
    {
        String ll=pp1.getText().toString();
        String l2=pp2.getText().toString();
        String ll1=k1.getText().toString();
        String ll2=k2.getText().toString();

        if( !ll.equals(l2))
        {
            Toast.makeText(SignUpActivity.this,"passwords do not match", Toast.LENGTH_LONG).show();
        }
        else{
            //Toast.makeText(Main3Activity.this,"added",Toast.LENGTH_SHORT).show();

            contact c=new contact();
            c.set_name(ll1);
            c.set_pass(ll);
            c.set_email(ll2);
            //Toast.makeText(Main3Activity.this,"added1",Toast.LENGTH_SHORT).show();

            helper.insertcontact(c);
            Toast.makeText(Main3Activity.this,"added to DB",Toast.LENGTH_SHORT).show();

        }

    }
}
