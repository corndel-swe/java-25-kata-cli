package org.kata.tania;

import java.util.ArrayList;
import java.util.List;

public class MissingLetters {

    /**
     * Returns a string containing all the alphabetical characters that do not appear
     * in the given input string. The result is case-insensitive and consists of
     * missing letters in alphabetical order.
     *
     * @param word the input string to check for missing alphabetical characters
     * @return a string of missing letters in alphabetical order, or an empty string if no letters are missing
     * <p>
     * hints:
     * - Only the 26 letters of the English alphabet (a-z) are considered.
     * - The result should be in lowercase and in alphabetical order.
     * - Non-alphabetical characters (numbers, spaces, punctuation) are ignored.
     */
    public String getMissingLetters(String word) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        word = word.toLowerCase();

        //Using StringBuilder to remove letters in loop
        StringBuilder sb = new StringBuilder(alphabet);
        for (char c : word.toCharArray()) {
            int index = sb.indexOf(String.valueOf(c));
            if (index != -1) {sb.deleteCharAt(index);}
            // remove letter; flags letter as not found as opposed to index value (1) = found and remove, (-1) = not found and skipped





        }//if no letters are missing, return empty String using Tenary Operator
        return sb.isEmpty() ? "": sb.toString();

    }

}



