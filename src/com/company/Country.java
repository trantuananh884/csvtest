package com.company;

import java.io.Serializable;

public class Country implements Serializable {
    String name;
    int id;
    String shortname;
    public Country(String _name,int id, String _shortname){
        this.name = _name;
        this.id = id;
        this.shortname = _shortname;
    }
    public Country(){

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getShortname() {
        return shortname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
}
