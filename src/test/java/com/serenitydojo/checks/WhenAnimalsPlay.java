package com.serenitydojo.checks;

import com.serenitydojo.Cat;
import com.serenitydojo.Dog;
import com.serenitydojo.Hamster;
import com.serenitydojo.Pet;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenAnimalsPlay {

    @Test
    public void whenAnimalsPlay() {
        Pet fido = new Dog("Fido","Bone", 5);
        Pet spot = new Cat("Spot","String", 5);
        Pet hazel = new Hamster("Hazel", 1, "Wheel");


        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(hazel.play(), equalTo("runs in wheel"));
    }
}
