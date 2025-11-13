package org.kata.tania;

public class LargestPrime {

    /**
     * Finds the largest prime number less than or equal to a given integer.
     * <p>
     * The function takes an integer input and returns the largest prime number that is less than or equal
     * to the specified integer. If the input integer is less than 2, the function will return -1, as there
     * are no prime numbers below 2. If the input integer itself is prime, the function will return that
     * integer. The implementation efficiently checks each number starting from the given integer and works
     * downwards, stopping at the first prime number it encounters.
     * <p>
     * A prime number is defined as a natural number greater than 1 that cannot be formed by multiplying
     * two smaller natural numbers. This means that a prime number has exactly two distinct positive divisors:
     * 1 and itself.
     */

    public int getLargestPrime(int n) {
        if ( n < 2) {return -1;}
        if (n == 2) {return n;}
        for (int i = n; i > 2; i--) {
            if (isPrime(i)) {return i;}
        }

   return -1;}

    private boolean isPrime (int num) {
        if (num < 2) {return false;}
        if (num == 2) {return true;}
        if (num % 2 == 0) {return false;}
        for (int i = 3; i*i <= num; i+=2) {
            if(num%i ==0) {return false;}

        }


    return true;}
}


