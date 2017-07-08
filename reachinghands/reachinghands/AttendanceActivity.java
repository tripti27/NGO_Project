package com.cfg.reachinghands;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.cfg.reachinghands.Adapters.AttendenceAdapter;
import com.cfg.reachinghands.Beans.Staff;

import java.util.ArrayList;

public class AttendanceActivity extends AppCompatActivity {

    private RecyclerView mAttendenceView;
    private RecyclerView.LayoutManager mAttendenceLayoutManager;
    private RecyclerView.Adapter mAttendenceAdapter;
    private ArrayList<Staff> mStaffList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        getSupportActionBar().setTitle("Mark Attendance");

        //Staff RecyclerView
        mAttendenceView = (RecyclerView) findViewById(R.id.attendanceview);
        mAttendenceView.setHasFixedSize(true);
        mAttendenceLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mAttendenceView.setLayoutManager(mAttendenceLayoutManager);
        mAttendenceAdapter =  new AttendenceAdapter(mStaffList);
        mAttendenceView.setAdapter(mAttendenceAdapter);

        mStaffList = new ArrayList<>();
        mStaffList.add(new Staff("2", "3", "4", "5"));

    }
/*
    private void getData() {
        String id = editTextId.getText().toString().trim();
        if (id.equals("")) {
            Toast.makeText(this, "Please enter an id", Toast.LENGTH_LONG).show();
            return;
        }
        loading = ProgressDialog.show(this,"Please wait...","Fetching...",false,false);

        String url = Config.DATA_URL+editTextId.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loading.dismiss();
                showJSON(response);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this,error.getMessage().toString(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    */
}
