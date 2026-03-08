/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
// Longest common prefix
import java.util.Scanner;

public class CommonPrefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        String[] strs = new String[n];

        // Take input for each string
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }

        // Create Solution object and call longestCommonPrefix
        Solution solution = new Solution();
        String lcp = solution.longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix: " + lcp);
    }
}

// Your original Solution class (not modified)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null)
        {
            return " ";
        }
        for(int i = 0; i < strs[0].length(); i++)
        {
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++)
            {
                if(i == strs[j].length() || strs[j].charAt(i) != ch)
                {
                    return strs[0].substring(0,i);
                }
            }
        }
          return strs[0];
    }
}
