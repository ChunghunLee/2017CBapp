package com.chan.testapplication;

import java.io.Serializable;
import java.util.ArrayList;

public class searchList implements Serializable {
    private int count;
    public ArrayList<String> mArrayList;

    searchList(String arr) {
        this.mArrayList.add(this.count, arr);
        this.count++;
    }
}
