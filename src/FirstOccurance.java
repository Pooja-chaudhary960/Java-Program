/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class FirstOccurance {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if(nLen == 0) return 0; 

        for(int i = 0; i <= hLen - nLen; i++) { 
            int j;
            for(j = 0; j < nLen; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break; 
                }
            }
            if(j == nLen) return i; 
        }
        return -1;
    }
}