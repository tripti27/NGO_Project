package com.cfg.reachinghands.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.cfg.reachinghands.Beans.Staff;
import com.cfg.reachinghands.Beans.StaffList;
import com.cfg.reachinghands.R;

import java.util.ArrayList;

/**
 * Created by Varsha on 08-07-2017.
 */

public class AttendenceAdapter extends RecyclerView.Adapter<AttendenceAdapter.ViewHolder> {

    private ArrayList<Staff> mStaffList;

    public AttendenceAdapter(ArrayList<Staff> mStaffList) {

        this.mStaffList = StaffList.getInstance().mStaffList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.each_staff, parent, false);

        AttendenceAdapter.ViewHolder vh = new AttendenceAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(mStaffList.get(position).getName());
        holder.date.setText(mStaffList.get(position).getDate());
        holder.in.setText(mStaffList.get(position).getIn_time());
        holder.out.setText(mStaffList.get(position).getOut_time());
        //holder.name.setText("hello");
    }

    @Override
    public int getItemCount() {
        return StaffList.getInstance().mStaffList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name, date, in, out;
        Button setAttendance;
        View mView;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            name = (TextView)itemView.findViewById(R.id.staff_name);
            date = (TextView)itemView.findViewById(R.id.staff_date);
            in = (TextView)itemView.findViewById(R.id.in_time);
            out = (TextView)itemView.findViewById(R.id.out_time);

        }
    }
}
