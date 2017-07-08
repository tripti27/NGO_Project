package com.cfg.reachinghands;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.cfg.reachinghands.Adapters.AttendenceAdapter;
import com.cfg.reachinghands.Beans.Staff;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AttendanceActivity extends AppCompatActivity {

    private RecyclerView mAttendenceView;
    private RecyclerView.LayoutManager mAttendenceLayoutManager;
    private RecyclerView.Adapter mAttendenceAdapter;
    private ArrayList<Staff> mStaffList;
    ProgressDialog loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        getSupportActionBar().setTitle("Mark Attendance");
        getData();

        //Staff RecyclerView
        mAttendenceView = (RecyclerView) findViewById(R.id.attendanceview);
        mAttendenceView.setHasFixedSize(true);
        mAttendenceLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mAttendenceView.setLayoutManager(mAttendenceLayoutManager);
        mAttendenceAdapter =  new AttendenceAdapter(mStaffList);
        mAttendenceView.setAdapter(mAttendenceAdapter);

        Staff staff = new Staff("-", "-", "-", "-");
        mStaffList = new ArrayList<>();
        mStaffList.add(staff);
        mStaffList.add(new Staff("2", "3", "4", "5"));

    }

    private void getData() {
        String id = "1"; //editTextId.getText().toString().trim();
        if (id.equals("")) {
            Toast.makeText(this, "Please enter an id", Toast.LENGTH_LONG).show();
            return;
        }
        loading = ProgressDialog.show(this,"Please wait...","Fetching...",false,false);

        String url = Config.DATA_URL;         //editTextId.getText().toString().trim();

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
                        Toast.makeText(AttendanceActivity.this,error.getMessage().toString(),Toast.LENGTH_LONG).show();
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }

    private void showJSON(String response) {
        try {
            JSONObject root = new JSONObject(response);
            JSONArray array = root.getJSONArray("");

            for(int i = 0; i < array.length(); i++) {
                JSONObject each = array.getJSONObject(i);
                String name = each.getString("name");
                String date = each.getString("date");
                String intime = each.getString("in_time");
                String outtime = each.getString("out_time");
                Staff staff = new Staff(name, date, intime, outtime);
                mStaffList.add(staff);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
