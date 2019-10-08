package com.test.interview;

/**
 * @author kevin
 */
public class PrimeUtil {

    static int findNextPrime(int i) {
        i++;
        boolean isPrime = true;

        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                System.out.println(i + ":" + j);
                break;
            }
        }
        if (isPrime) {
            return i;
        } else {
            return findNextPrime(i);
        }

    }


    public static void main(String[] args) {
        System.out.println(PrimeUtil.findNextPrime(20000));

    }
}
