/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Take two Numbers as a input from user and add them.
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class AddNumber {
    public static void main(String[] args){
        System.out.print("Enter first number: ");
        Scanner scan=new Scanner(System.in);//create scan object to read input
        int n1=scan.nextInt();// read the first number
        System.out.print("Enter second number: ");
        int n2= scan.nextInt();//read the second number
        int sum=n1+n2;//add the numbers
        System.out.println("Sum is " + sum);//Print the result 
    }
    
}
