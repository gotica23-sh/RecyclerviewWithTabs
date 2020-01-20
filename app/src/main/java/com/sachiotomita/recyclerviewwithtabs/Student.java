package com.sachiotomita.recyclerviewwithtabs;

/**
 * Created by sat on 1/20/20.
 */
public class Student {
    String name,add;


    public Student(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
