package com.serenitydojo;

public abstract class Pet {

    private String name;
    public int age;


    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }


    public abstract String play();


}
