package com.cfg.reachinghands;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    EditText num, desc;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().setTitle("Reaching Hands");
        getSupportActionBar().setSubtitle("Send Message");

        num = (EditText) findViewById(R.id.phone);
        desc = (EditText) findViewById(R.id.desc);

        final String phoneStr = num.getText().toString();
        final String descStr = desc.getText().toString();

        send = (Button)findViewById(R.id.sendbutton);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(phoneStr, null, descStr, null, null);
            }
        });

    }
}
