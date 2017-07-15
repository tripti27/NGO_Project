package com.cfg.reachinghands;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cfg.reachinghands.Adapters.RequestAdapter;
import com.cfg.reachinghands.Beans.Request;
import com.cfg.reachinghands.Beans.RequestList;
import com.cfg.reachinghands.Beans.Staff;
import com.cfg.reachinghands.Beans.StaffList;

import java.util.ArrayList;

public class RequestActivity extends AppCompatActivity {

    private static RecyclerView mRequestView;
    private static RecyclerView.LayoutManager mRequestLayoutManager;
    private static RecyclerView.Adapter mRequestAdapter;
    private static Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        getSupportActionBar().setTitle("Reaching Hands");
        getSupportActionBar().setSubtitle("Approve request");

        Request request = new Request("-", 0, "-", "-");
        RequestList.getInstance().mRequestList = new ArrayList<>();

        //Staff RecyclerView
        mRequestView = (RecyclerView) findViewById(R.id.requestview);
        mRequestView.setHasFixedSize(true);
        mRequestLayoutManager = new LinearLayoutManager(this);
        mRequestView.setLayoutManager(mRequestLayoutManager);
        con = getApplicationContext();
        notifyAdapter();
    }

    public static void notifyAdapter() {
        mRequestAdapter =  new RequestAdapter(RequestList.getInstance().mRequestList, con);
        mRequestView.setAdapter(mRequestAdapter);
    }

}
