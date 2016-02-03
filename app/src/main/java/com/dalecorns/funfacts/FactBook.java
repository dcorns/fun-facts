package com.dalecorns.funfacts;

import java.util.Random;

/**
 * Created by dcorns on 2/2/16.
 */
public class FactBook {
    //fields (properties)
    String[] facts = {
            "No Food in the Library", "Study rooms are limited to 2 hours per day",
            "Study Rooms are first come, first serve", "I like working at the library",
            "Library hours are too short", "I use the library more for the Internet access than the books"
    };
    //Methods
    public String getFact(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}
