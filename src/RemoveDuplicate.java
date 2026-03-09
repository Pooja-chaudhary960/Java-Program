/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class RemoveDuplicate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
         int n = sc.nextInt(); 
        int[] nums = new int[n];
        
        System.out.print("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[j]!=nums[i])
            {
                nums[++j]=nums[i];
            }
        }
        System.out.println("Length after removing duplicates: " + (j + 1));
        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i <= j; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
