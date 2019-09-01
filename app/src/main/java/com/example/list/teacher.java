package com.example.list;

import java.util.ArrayList;

public class teacher {
    String name;
    String course;

    public teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
    public static ArrayList<teacher> get3randomteacher()
    {
        ArrayList<teacher> t = new ArrayList<>();
        t.add(new teacher("Vibhor","Machine Learning"));
        t.add(new teacher("Shikhar","GATE"));
        t.add(new teacher("Vedang","FCAT"));
        return t;

    }
}
