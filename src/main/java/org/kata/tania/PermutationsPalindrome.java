package org.kata.tania;

import java.util.*;

/**
 * Challenge - Permutations Palindrome
 * <p>
 * Write an efficient function that checks whether any permutation of an input string is a palindrome.
 * You can assume the input string only contains lowercase letters.
 * <p>
 * Examples:
 * <pre>
 *   "civic" should return true
 *   "ivicc" should return true
 *   "civil" should return false
 *   "livci" should return false
 * </pre>
 * <p>
 * Note:
 * Although 'ivicc' isn't a palindrome, a permutation of it ('civic') is.
 * Ensure you fully understand the question before starting.
 * Jumping in with a flawed understanding of the problem doesn’t look good in an interview.
 */
public class PermutationsPalindrome {

    public static boolean isPalindrome(String word) {
        Map<Character, Integer> counter = new HashMap<>();

        for (char c: word.toCharArray()){
            counter.put(c,counter.getOrDefault(c,0)+1);// default value of 0 created
            if (!counter.containsKey(c) && counter.get(c) > 1){
                return false;}


        }
        return true;
    }

}
