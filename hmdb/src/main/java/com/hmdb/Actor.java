package com.hmdb;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();
    public Integer id;
    public String firstName;
    public String lastName;
    public Integer yearOfBirth;

    static {
        Actor actor1 = new Actor(1, "Nicolas", "Cage", 1964);
    }

    public Actor(Integer id, String firstName, String lastName, Integer yearOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        Actor.actors.add(this);
    }

    public void displayInfo() {
        String message = "This is %s %s, I am %s year(s) old.\n";
        System.out.printf(message, this.firstName, this.lastName, this.yearOfBirth);
    }
}