/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author s11195133
 * //shivika edited
 */
public class Calculator {

    // Java program for simple calculator

 
// Driver class

    // main function
    public static void main(String[] args)
    {
        // Stores two numbers
        double num1, num2;
 
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Bula...this is made by shivika and deeya");
 
        System.out.println("Enter the numbers:");
 
        // Take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        double o = 0;
 
        switch (op) {
        // case to add two numbers
        case '+':
            o = num1 + num2;
            break;
 
        // case to subtract two numbers
        case '-':
            o = num1 - num2;
            break;
 
        // case to multiply two numbers
        case '*':
            o = num1 * num2;
            break;
 
        // case to divide two numbers
        case '/':
            o = num1 / num2;
            break;
 
        default:
            System.out.println("You enter wrong input");
        }
 
        System.out.println("The final result:");
        System.out.println();
 
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}