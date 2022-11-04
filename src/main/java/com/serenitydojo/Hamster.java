package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteToy;
    private String favoriteGame = "runs in wheel";

    public Hamster(String name, int age, String favoriteToy) {

        super(name,age);
        this.favoriteToy = favoriteToy;

    }

    @Override
    public String play() {
        return favoriteGame;
    }
}
