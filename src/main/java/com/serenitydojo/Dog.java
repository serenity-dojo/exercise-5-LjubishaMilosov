package com.serenitydojo;

public class Dog extends Pet{

    private String favoriteToy;
    private String favoriteGame = "plays with bone";
    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public boolean isFed() {
        return isFed;
    }

    // Exercise 4
    public String makeNoise() {return DOG_NOISE;}

    public void feed() {
        this.isFed = true;
    }

    public String play(){
        return favoriteGame;
    }


}
