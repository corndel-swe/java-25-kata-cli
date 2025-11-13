package org.kata.tania;

import java.util.HashMap;
import java.util.Map;

public class GetFrequencies {

    /**
     * Counts the frequency of each character in a string
     * <p>
     * The function takes a string input and returns a hashmap that contains the characters and their
     * frequencies as key-value pairs. It should ignore spaces.
     *
     * e.g. getFrequencies("corndell") returns hashMap of
     *  c - 1, o - 1, r - 1, n - 1, d - 1, e - 1, l - 2
     * <p>
     */

    public HashMap<Character, Integer> getFrequencies(String inputString) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char c: inputString.toCharArray()){
            counter.put(c,counter.getOrDefault(c,0)+1);// default value of 0 created
            // cannot call empty values in hashmaps without calling a nullpointer error
        }


        return new HashMap<>(counter);
    }

}
