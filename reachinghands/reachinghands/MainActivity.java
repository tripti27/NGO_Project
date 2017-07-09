package com.cfg.reachinghands;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.cfg.reachinghands.Beans.Staff;
import com.cfg.reachinghands.Beans.StaffList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    ProgressDialog loading;
    public static ArrayList<Staff> mStaffList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Admin");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_attendance) {
            int i = getData();
            if(i==1) {
                Intent intent = new Intent(MainActivity.this, AttendanceActivity.class);
                startActivity(intent);
            }

        } else if (id == R.id.nav_purchase) {
            int i = getData();
            if(i==2) {
                startActivity(new Intent(MainActivity.this, RequestActivity.class));
            }

        } else if (id == R.id.nav_records) {

        } else if (id == R.id.nav_reminder) {
            startActivity(new Intent(MainActivity.this, ReminderActivity.class));

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.attendance:
                int i = getData();
                if(i==1) {
                    Intent intent = new Intent(MainActivity.this, AttendanceActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.req:
                i = getData();
                if(i==2) {
                    startActivity(new Intent(MainActivity.this, RequestActivity.class));
                }
                break;
        }
    }

    private int getData() {

        loading = ProgressDialog.show(this,"Please wait...","Fetching...",false,false);

        String url = Config.ATTENDENCE_DATA_URL;         //editTextId.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loading.dismiss();
                Log.e("TAG", response);
                showJSON(response);
                //mAttendenceAdapter.notifyDataSetChanged();
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
        return 1;
    }

    private void showJSON(String response) {
        try {
            JSONObject root = new JSONObject(response);
            JSONArray array = root.getJSONArray("result");

            for(int i = 0; i < array.length(); i++) {
                Log.e("TAG", i + "");
                JSONObject each = array.getJSONObject(i);
                String name = each.getString("name");
                Log.e("TAG", name);
                String date = each.getString("address");
                Log.e("TAG", date);
                String intime = each.getString("vc");
                Log.e("TAG", intime);
                String outtime = "123";  //each.getString("out_time");
                Log.e("TAG", outtime);
                Staff staff = new Staff(name, date, intime, outtime);
                StaffList.getInstance().mStaffList.add(staff);
                Log.e("TAG", StaffList.getInstance().mStaffList.size() + " at main");
                AttendanceActivity.notifyAdapter();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    private int getDataReq() {

        loading = ProgressDialog.show(this,"Please wait...","Fetching...",false,false);

        String url = Config.REQUEST_DATA_URL;         //editTextId.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                loading.dismiss();
                Log.e("TAG", response);
                showJSONReq(response);
                //mAttendenceAdapter.notifyDataSetChanged();
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
        return 2;
    }

    private void showJSONReq(String response) {
        try {
            JSONObject root = new JSONObject(response);
            JSONArray array = root.getJSONArray("result");

            for(int i = 0; i < array.length(); i++) {
                Log.e("TAG", i + "");
                JSONObject each = array.getJSONObject(i);
                String name = each.getString("name");
                Log.e("TAG", name);
                String date = each.getString("address");
                Log.e("TAG", date);
                String intime = each.getString("vc");
                Log.e("TAG", intime);
                String outtime = "123";  //each.getString("out_time");
                Log.e("TAG", outtime);
                Staff staff = new Staff(name, date, intime, outtime);
                StaffList.getInstance().mStaffList.add(staff);
                Log.e("TAG", StaffList.getInstance().mStaffList.size() + " at main");
                AttendanceActivity.notifyAdapter();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
