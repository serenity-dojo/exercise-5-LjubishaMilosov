package com.serenitydojo;

public class Cat extends Pet{

    private String favoriteToy;
    private String favoriteGame = "plays with string";

    public Cat(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String play(){
        return favoriteGame;
    }


}
