package com.hmdb;

import java.util.ArrayList;

public class Movie {

    public Integer id;
    public String title;
    public String description;
    public Integer year;
    public Integer actorId;
    static {
        new Movie(1, "Ghost Rider", "Awesome", 2006, 1);
    }

    public Movie(Integer id, String title, String description, Integer year, Integer actorId) {

    }
}
