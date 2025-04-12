package com.java.standard.basicprog.neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*  :Contains Duplicate:
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
    private static boolean isArrayContainsDuplicateData(int[] intArr) {
        boolean containsDuplicate = false;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i+1; j < intArr.length; j++) {
                if (intArr[i] == intArr[j]) {
                    containsDuplicate = true;
                    break;
                }
            }
        }
        System.out.println("Array contains duplicate?: " + containsDuplicate);
        return containsDuplicate;
    }

    // O(n log n)
    private static boolean isArrayContainsDuplicateData_UsingSorting(int[] intArr) {
        System.out.println("Before sort: " + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("After sort: " + Arrays.toString(intArr));

        boolean containsDuplicate = false;
        for (int i = 0; i < intArr.length -1; i++) {
            if (intArr[i] == intArr[i + 1]) {
                containsDuplicate = true;
                break;
            }
        }
        System.out.println("Array contains duplicate?: " + containsDuplicate);
        return containsDuplicate;
    }

    // O(n)
    private static boolean isArrayContainsDuplicateData_UsingHashSet(int[] intArr) {
        Set<Integer> uniqueSet = new HashSet<>();

        boolean containsDuplicate = false;
        for (int i : intArr) {
            if(!uniqueSet.add(i)) {
               containsDuplicate = true;
               break;
            }
        }
        System.out.println("Array contains duplicate?: " + containsDuplicate);
        return containsDuplicate;
    }
}
