package com.cfg.reachinghands.Beans;

import java.util.ArrayList;

/**
 * Created by Varsha on 09-07-2017.
 */

public class StaffList {
    private static StaffList instance =  new StaffList();;

    public ArrayList<Staff> mStaffList = new ArrayList<>();

    public static StaffList getInstance() {
        return instance;
    }

    public StaffList() {
    }

    public int getCount() {
        return mStaffList.size();
    }

    public ArrayList<Staff> getmStaffList() {
        return mStaffList;
    }

}
