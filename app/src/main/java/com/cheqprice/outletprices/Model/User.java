package com.cheqprice.outletprices.Model;

/**
 * Created by tatllo on 05/06/2017.
 */

public class User {

    public String getName() {
        return name;
    }

    private String id;

    private String name;
    private String fname;
    private String mname;
    private String lname;
    private String email;
    private String password;

    public String getSupermarket() {
        return supermarket;
    }

    private String supermarket;

    public String getFname() {
        return fname;
    }

    public String getId() {
        return id;
    }

    public String getLname() {
        return lname;
    }

    public String getMname() {
        return mname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
