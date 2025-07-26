/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author I-SEVEN
 */ 
public class FirstClass{
 static void practiceIf () {
   int n= 5;
     if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
          System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
           System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");}}
 static void practiceFor (){for (int i = 0; i <= 20; i++) {
                if (i% 2 ==0)
                {System.out.println(i);}
              //  print the multi table print the multi table 
               for (int S = 1; S <= 12; i++) {
                for (int j = 1; j <= 12; j++)
                {System.out.println(S +"*"+j+"="+(S*j));
                }}}}
         static void practiceFor2(){
            for (int x = 1; x <= 5; x++)
            {for (int y = 1; y <= x; y++) {
                    System.out.print("*");  
                }
                System.out.println();
                
            } }
        public static void main(String[] args) {
//         double temperature = 25.5;
//      System.out.println(temperature);
//      double kelvin= temperature+273.15;
//      // hwo to convert celsius to kelvin Kelvin=Celsius+273.15
//      System.out.println(kelvin);
//      Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//
//        int i = 1;
//        long factorial = 1;
//
//        do {
//            factorial *= i;
//                    
//            i++;
//        } while (i <= num);
//
//        System.out.println("Factorial of " + num + " is " + factorial);
           // a=0 , b=2 , n =10 a+b*1 to 10 
         Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(a+(b*n));
        }
        }}
       



        
             
    

  

