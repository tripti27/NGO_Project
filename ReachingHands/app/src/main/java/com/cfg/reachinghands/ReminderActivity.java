package com.cfg.reachinghands;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        getSupportActionBar().setTitle("Reaching Hands");
        getSupportActionBar().setSubtitle("Appointment Reminder");


    }
}
