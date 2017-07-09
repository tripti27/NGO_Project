package com.cfg.reachinghands.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cfg.reachinghands.Beans.Request;
import com.cfg.reachinghands.Beans.Staff;
import com.cfg.reachinghands.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Varsha on 09-07-2017.
 */

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.ViewHolder>{

    private ArrayList<Request> mReqList;
    Context con;

    public RequestAdapter(ArrayList<Request> mReqList, Context con) {
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
        /*
        holder.item_name.setText(mReqList.get(position).getItem());
        holder.qty.setText(mReqList.get(position).getQty() + "");
        holder.who.setText(mReqList.get(position).getWho());
        holder.desc.setText(mReqList.get(position).getDesc());
        */
        if(position == 1) {
            holder.item_name.setText("Bread");
            holder.qty.setText("2");
            holder.who.setText("Kamlesh");
            holder.desc.setText("Urgent requirement");
        }
        holder.item_name.setText("Tomatoes");
        holder.qty.setText("5kgs");
        holder.who.setText("Nirmala");
        holder.desc.setText("Whenever Possible!");
    }

    @Override
    public int getItemCount() {
        return 2; /*mReqList.size();*/
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView who, item_name, qty, desc;
        Button approve, cancel;
        View mView;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            item_name = (TextView) itemView.findViewById(R.id.item_name);
            who = (TextView) itemView.findViewById(R.id.who);
            qty = (TextView) itemView.findViewById(R.id.qty);
            desc = (TextView) itemView.findViewById(R.id.desc);

            approve = (Button) itemView.findViewById(R.id.approve);
            cancel = (Button) itemView.findViewById(R.id.cancel);

            approve.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(con, "Approved!", Toast.LENGTH_SHORT).show();
                }
            });
            cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(con, "Cancelled!", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
