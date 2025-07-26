/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author I-SEVEN
 */
public class Person {
    String name; int age ;
    Person(String n , int a){name = n; age = a ;}
    Person( String na){name= na;age = 0; }
        
   
     public void person_data(){
         System.out.println("name"+ " "  +  name  +  " age " + " "  + age );
         
     }
}
