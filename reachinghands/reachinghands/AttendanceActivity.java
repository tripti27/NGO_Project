package com.cfg.reachinghands;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.cfg.reachinghands.Adapters.AttendenceAdapter;
import com.cfg.reachinghands.Beans.Staff;
import com.cfg.reachinghands.Beans.StaffList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AttendanceActivity extends AppCompatActivity {

    private static RecyclerView mAttendenceView;
    private static RecyclerView.LayoutManager mAttendenceLayoutManager;
    private static RecyclerView.Adapter mAttendenceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);
        getSupportActionBar().setTitle("Mark Attendance");

        Staff staff = new Staff("-", "-", "-", "-");
        StaffList.getInstance().mStaffList = new ArrayList<>();
        StaffList.getInstance().mStaffList.add(staff);
        StaffList.getInstance().mStaffList.add(new Staff("2", "3", "4", "5"));

        Log.e("TAG", StaffList.getInstance().mStaffList.toString() + " at attendence");

        //Staff RecyclerView
        mAttendenceView = (RecyclerView) findViewById(R.id.attendanceview);
        mAttendenceView.setHasFixedSize(true);
        mAttendenceLayoutManager = new LinearLayoutManager(this);
        mAttendenceView.setLayoutManager(mAttendenceLayoutManager);
        notifyAdapter();
    }

    public static void notifyAdapter() {
        mAttendenceAdapter =  new AttendenceAdapter(StaffList.getInstance().mStaffList);
        mAttendenceView.setAdapter(mAttendenceAdapter);
    }

}
