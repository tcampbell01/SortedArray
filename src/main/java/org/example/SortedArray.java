///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Sorted Array
// Course:          CS 200, Summer 2024
//
// Author:          Teresa Campbell
// Email:           tjcampbe@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Consulted ChatGPT for this line of code:
// while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
//                i++;
//            }
//
//
//
//
///////////////////////////////// REFLECTION ///////////////////////////////////
//
//
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

//package org.example;

/**
 * This class contains a method to determine the order of elements in an array,
 * whether they are sorted in ascending, descending, or unsorted order.
 */

public class SortedArray {

    /**
     * Determines the order of elements in an array.
     *
     * @param nums Array of integer values.
     * @return A string indicating if the array is "Ascending",
     * "Descending", or "Not Sorted".
     */
    public static String findOrder(int[] nums) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < nums.length - 1; i++) {
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
            if (i < nums.length - 1) {
                if (nums[i] < nums[i + 1]) {
                    descending = false;
                } else if (nums[i] > nums[i + 1]) {
                    ascending = false;
                }
            }
        }

        if (ascending) {
            return "Ascending";
        } else if (descending) {
            return "Descending";
        } else {
            return "Not sorted";
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

        // Test another descending example.
//        int[] nums5 = {10, 10, 9, 9, 9, 9, 8, 8, 7, 6, 5};
//        System.out.println(findOrder(nums5)); // Output: Descending
    }
}