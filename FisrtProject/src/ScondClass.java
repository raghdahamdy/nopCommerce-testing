/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class ScondClass {
        public static void main(String[] args) {
           //Print all even numbers from 1 to 50
            for (int i = 1; i <= 50; i++) {
                if(i%2==0)
              {System.out.println(i);  
            }}
         //Find the factorial of a number 5.  
                 int fact = 1;
                 int N=5;
        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + N + " is: " + fact);               
            
            //Print the multiplication table for numbers 1 to 12.
            for (int y = 1; y <=12; y++) {
                for (int z = 1; z <= 12; z++) {
                    System.out.println(y+"*"+z+"="+(y*z));}}
              //Count how many numbers between 1 and 100 are divisible by 3 and 5.
              for (int n = 1; n <= 100; n++) {
                if(n%3==0 && n%5==0){
                    System.out.println(n);
            }}
               
            
  }}
