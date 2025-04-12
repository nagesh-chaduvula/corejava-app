package com.java.standard.basicprog.neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*  Contains Duplicate:
    =======================
       Given an integer array nums,
       return true if the value appears at least twice in the array,
       return false if every element is distinct.

    Common Big O Time Complexities
    ================================
       O(1) - Constant Time
       O(log n) - Logarithmic Time
       O(n) - Linear Time
       O(n log n) - Linearithmic Time
       O(n²) - Quadratic Time
       O(n³) - Cubic Time
       O(2ⁿ) - Exponential Time
       O(n!) - Factorial Time
*/

public class IsIntArrayDataDuplicate {
    public static void main(String[] args) {
        System.out.println("************ O(n2) - Quadratic time ***********");
        isArrayContainsDuplicateData(new int[] {1, 3, 1, 2, 4});

        System.out.println("\n************ O(n log n) - Linearithmic Time ***********");
        isArrayContainsDuplicateData_UsingSorting(new int[] {1, 3, 1, 2, 4});

        System.out.println("\n************ O(n) - Linear Time ***********");
        isArrayContainsDuplicateData_UsingHashSet(new int[] {1, 3, 1, 2, 4});
    }

    // O(n2)
    private static void isArrayContainsDuplicateData(int[] numbs) {
        boolean containsDuplicate = false;
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i+1; j < numbs.length; j++) {
                if (numbs[i] == numbs[j]) {
                    containsDuplicate = true;
                    break;
                }
            }
        }
        System.out.println("Array contains duplicate?: " + containsDuplicate);
    }

    // O(n log n)
    private static void isArrayContainsDuplicateData_UsingSorting(int[] numbs) {
        System.out.println("Before sort: " + Arrays.toString(numbs));
        Arrays.sort(numbs);
        System.out.println("After sort: " + Arrays.toString(numbs));

        boolean containsDuplicate = false;
        for (int i = 0; i < numbs.length -1; i++) {
            if (numbs[i] == numbs[i + 1]) {
                containsDuplicate = true;
                break;
            }
        }
        System.out.println("Array contains duplicate?: " + containsDuplicate);
    }

    // O(n)
    private static void isArrayContainsDuplicateData_UsingHashSet(int[] numbs) {
        Set<Integer> uniqueSet = new HashSet<>();

        boolean containsDuplicate = false;
        for (int i : numbs) {
            if(!uniqueSet.add(i)) {
               containsDuplicate = true;
               break;
            }
        }
        System.out.println("Array contains duplicate?: " + containsDuplicate);
    }
}
