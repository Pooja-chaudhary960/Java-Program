/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
/**
 *
 * @author Acer
 */
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
        
public class TwoSum {
    public static void main(String[] args)
    {
        //create ob sc and by the help of sc object read the user input
        Scanner sc = new Scanner(System.in);
        // Take size of array
        System.out.print("Enter the Size of array: ");
        int n = sc.nextInt();
       int[] nums = new int[n];
       //Take element in array
       System.out.print("Enter the elements of the array: ");
       for(int i=0; i<n; i++)
       {
           nums[i]=sc.nextInt();
       }
       //Take target input
       System.out.print("Enter target number: ");
       int target = sc.nextInt();
       // call the function to find indices
       int[] result = findTwoSum(nums,target);
       if(result!=null)
       {
          System.out.println("Indices of numbers that add up to target: " + result[0] + ", " + result[1]);
       }else{
           System.out.print("No solution found");
       }
       
    }
    // Function to find two indices
    public static int[] findTwoSum(int[] nums, int target){
        //store number and its index
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                // return indices
                return new int[]{map.get(complement),i};
            }
            // store number with its indices
            map.put(nums[i], i);
            
        }
        return null; // No solution found
    }
}
