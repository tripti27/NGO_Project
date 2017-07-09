package com.cfg.reachinghands.Beans;

import java.util.ArrayList;

/**
 * Created by Varsha on 09-07-2017.
 */

public class RequestList {
    private static RequestList instance =  new RequestList();;

    public ArrayList<Request> mRequestList = new ArrayList<>();

    public static RequestList getInstance() {
        return instance;
    }

    public RequestList() {
    }

    public int getCount() {
        return mRequestList.size();
    }

    public ArrayList<Request> getmRequestList() {
        return mRequestList;
    }
}
