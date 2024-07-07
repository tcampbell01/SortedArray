///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Weekly Averages
// Course:          CS 200, Summer 2024
//
// Author:          Teresa Campbell
// Email:           tjcampbe@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// I used ChatGPT to figure out how to use Junit
//
//
//
//
///////////////////////////////// REFLECTION ///////////////////////////////////
//
// 1. Describe the problem you wrote the program to solve: This app takes in the
// high temperatures for the last 7 days and outputs the weekly average.
// 2. What are the biggest challenges you encountered: I thought the testing was
// tricky.  I wanted to use junit because this is what we use often at optum and
// I wanted experience setting up the tests using junit.
// 3. What did you learn from this assignment: How to use junit for testing.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

package org.example;

/**
 * This class contains a method to determine the order of elements in an array,
 * whether they are sorted in ascending, descending, or unsorted order.
 */

public class SortedArray {

    /**
     * Determines the order of elements in an array.
     *
     * @param nums Array of integer values.
     * @return A string indicating if the array is "Ascending", "Descending", or "Not Sorted".
     */
    public static String findOrder(int[] nums) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1] || nums[i] == nums[i + 1]) {
                descending = false;
            } else if (nums[i] > nums[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            return "Ascending";
        } else if (descending) {
            return "Descending";
        } else {
            return "Not Sorted";
        }
    }

    /**
     * This is the main method that calls the findOrder method and tests it.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        // Test not sorted example.
        int[] nums1 = {5, 6, 7, 8, 3};
        System.out.println(findOrder(nums1)); // Output: Not Sorted

        // Test ascending example.
        int[] nums2 = {5, 6, 7, 10};
        System.out.println(findOrder(nums2)); // Output: Ascending

        // Test descending example.
        int[] nums3 = {8, 6, 3, 1};
        System.out.println(findOrder(nums3)); // Output: Descending

        // Test equal example.
        int[] nums4 = {6, 6, 6};
        System.out.println(findOrder(nums4)); // Output: Ascending
    }
}
