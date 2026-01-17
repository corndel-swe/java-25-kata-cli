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


// Counting the occurrence of letters into Hashmap
        for (char c: word.toCharArray()){
            counter.put(c,counter.getOrDefault(c,0)+1);}// default value of 0 created

        // Checking count is odd
        int odd = 0;
        for (int i : counter.values()){
        if (i % 2 != 0) odd++;}

        if (odd > 2){return false;}


// returns true for permutation palindrome to occur
        return true;  }
}


