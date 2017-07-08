package com.cfg.reachinghands.Beans;

/**
 * Created by Varsha on 08-07-2017.
 */

public class Staff {
    private String name;
    private String date;
    private String in_time;
    private String out_time;

    public Staff(String name, String date, String in_time, String out_time) {
        this.name = name;
        this.date = date;
        this.in_time = in_time;
        this.out_time = out_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIn_time() {
        return in_time;
    }

    public void setIn_time(String in_time) {
        this.in_time = in_time;
    }

    public String getOut_time() {
        return out_time;
    }

    public void setOut_time(String out_time) {
        this.out_time = out_time;
    }
}
