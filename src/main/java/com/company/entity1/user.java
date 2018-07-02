package com.company.entity1;

public class user {
    private int id;
    private String first_name;
    private String last_name;

    public user (final int id, final String fist_name, final String last_name){
        this.id=id;
        this.first_name = fist_name;
        this.last_name = last_name;
    }

    public int getId() {
        return id;
    }

    public String getFist_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setFist_name(String fist_name) {
        this.first_name = fist_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
