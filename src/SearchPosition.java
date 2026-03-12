/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class SearchPosition {
    // Method to find the insert position
    public int searchInsert(int[] nums, int target) {
        int mid;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (target < nums[mid]) {
                right = mid - 1; // Search left half
            } else {
                left = mid + 1;  // Search right half
            }
        }
        return left; // Target not found, return insert position
    }

    // Main method to test the searchInsert function
    public static void main(String[] args) {
        SearchPosition sp = new SearchPosition(); // Create object

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Insert position of " + target1 + " is: " + sp.searchInsert(nums1, target1));
        // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Insert position of " + target2 + " is: " + sp.searchInsert(nums2, target2));
        // Output: 1
    }
}