package com.demo.sqlitedababase;

/**
 * Created by Belal on 9/30/2017.
 */

public class Employee {
    private int id;
    private String mname;
    private String musername;
    private String memail;
    private String mphno;

    Employee(int id, String mname, String musername, String memail, String mphno) {
        this.id = id;
        this.mname = mname;
        this.musername = musername;
        this.memail = memail;
        this.mphno = mphno;
    }


    public int getId() {
        return id;
    }

    public String getMname() {
        return mname;
    }

    public String getMusername() {
        return musername;
    }

    public String getMemail() {
        return memail;
    }

    public String getMphno() {
        return mphno;
    }

}
