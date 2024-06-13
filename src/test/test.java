package test;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String[] arr = {"dh7js4jf", "or2rjvn2w", "h1n36mfl", "a7e6fw"};
        int result = findLargestSumOfDigits(arr);
        System.out.println("The largest sum of digits is: " + result);
    }

    public static int findLargestSumOfDigits(String[] arr) {
        int maxSum = 0;

        for (String str : arr) {
            int currentSum = 0;
            for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    currentSum += Character.getNumericValue(ch);
                }
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}

