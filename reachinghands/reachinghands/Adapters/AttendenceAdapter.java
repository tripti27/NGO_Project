package com.cfg.reachinghands.Adapters;

import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.cfg.reachinghands.AttendanceActivity;
import com.cfg.reachinghands.Beans.Staff;
import com.cfg.reachinghands.Beans.StaffList;
import com.cfg.reachinghands.Dialogs.DatePicker;
import com.cfg.reachinghands.R;

import java.util.ArrayList;

/**
 * Created by Varsha on 08-07-2017.
 */

public class AttendenceAdapter extends RecyclerView.Adapter<AttendenceAdapter.ViewHolder> {

    private ArrayList<Staff> mStaffList;
    Context con;

    public AttendenceAdapter(Context con, ArrayList<Staff> mStaffList) {

        this.mStaffList = StaffList.getInstance().mStaffList;
        this.con = con;
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
    }

    @Override
    public int getItemCount() {
        return StaffList.getInstance().mStaffList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name, date;
        public EditText in, out;
        Button setAttendance;
        View mView;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            name = (TextView) itemView.findViewById(R.id.staff_name);
            date = (TextView) itemView.findViewById(R.id.staff_date);
            in = (EditText) itemView.findViewById(R.id.in_time);
            out = (EditText) itemView.findViewById(R.id.out_time);
            in.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DialogFragment dialogFragment = new DatePicker(in);
                    dialogFragment.show(((AttendanceActivity)con).getSupportFragmentManager(), "datePicked");
                }
            });
            out.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DialogFragment dialogFragment = new DatePicker(in);
                    dialogFragment.show(((AttendanceActivity)con).getSupportFragmentManager(), "datePicked");
                }
            });
        }
    }
}


