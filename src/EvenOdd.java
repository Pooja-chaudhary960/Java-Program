/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Take number from user as a input and check the number is odd or even?

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class EvenOdd {
    public static void main(String[] args){
        int number;
        System.out.print("Enter number = ");
        Scanner scan=new Scanner(System.in);
        number=scan.nextInt();
        if(number%2==0)
        {
            System.out.println(number+" is even");
        }else{
            System.out.println(number+ " is odd");
        }
        scan.close();
        
    }
    
}
