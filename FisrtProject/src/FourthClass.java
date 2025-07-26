/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author I-SEVEN
 */
public class FourthClass { 
    
    static void course(){
 int  numbers []={8, 3, 15, 1, 9};
    int max = numbers[0];
    int min=numbers[0];
        for (int i = 1; i <numbers.length; i++) {
             if (numbers[i] > max) {
                max = numbers[i]; // لو الرقم أكبر من max، نخليه هو الجديد
            }
            if (numbers[i] < min) {
                min = numbers[i]; // لو الرقم أصغر من min، نخليه هو الجديد
            }
        }

        // في الآخر بنطبع النتائج
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
   }
    
    public static void main(String[] args) {
          /*Scanner reader= new Scanner (System.in);
   int guess, rand;
   rand= (int)(Math.random()*100);
   boolean stillplaying= true;
System.out.println("the generated randaom number is 0 and 100"+ rand);
   while(stillplaying){System.out.println("guess number between 0 and 100");
   guess=reader.nextInt();
   if(guess>rand){System.out.println("guess too large");
   
   if(guess<rand)
       System.out.println("guess too too small");
   else 
           System.out.println(" you win");
   stillplaying=false;*/
//          {Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if( a+b + (a*b)== a+b +b)
//                {System.out.println("Yes");}
//	
//                else{
//                        System.out.println("no");}}
	int x []={25 ,33,6,45,87};
       int max =x[0]; int min =x[0];
        for (int i = 0; i < x.length; i++){
        
         if(x[i]>max){max=x[i];}
                      
        }           
        System.out.println(max);
         for (int j = 0; j < x.length; j++){if(x[j]<min){min=x[j];}}
        System.out.println(min); 
    }}

