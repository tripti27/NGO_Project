package com.cfg.reachinghands.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cfg.reachinghands.Beans.Staff;
import com.cfg.reachinghands.R;

import java.util.ArrayList;

/**
 * Created by Varsha on 09-07-2017.
 */

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.ViewHolder>{

    private ArrayList<Staff> mReqList;
    Context con;

    public RequestAdapter(ArrayList<Staff> mReqList, Context con) {
        this.mReqList = mReqList;
        this.con = con;
    }

    @Override
    public RequestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.each_request, parent, false);

        RequestAdapter.ViewHolder vh = new RequestAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RequestAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
