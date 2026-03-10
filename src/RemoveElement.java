/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
class RemoveElement{
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
       
         int newLength = removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
    }
   }

    // Method must be inside the class
    // Method to remove all occurrences of 'val' from 'nums'
    static int removeElement(int[] nums, int val) {
        int count = 0; // Counter for valid elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i]; // Move valid element to front
                count++;
            }
        }
        return count; // New length of array
    }
}