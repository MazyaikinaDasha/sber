package com.company.entity1;

public class user {
     int id;
     String first_name;
     String last_name;

    public user ( int id,  String first_name,  String last_name){
        this.id = id;
        this.first_name = first_name;
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

    public void setFist_name(String first_name) {
        this.first_name = first_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
