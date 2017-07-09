package com.cfg.reachinghands.Beans;

import android.content.Intent;

/**
 * Created by Varsha on 09-07-2017.
 */

public class Request {
    String item;
    int qty;
    String who;
    String desc;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
