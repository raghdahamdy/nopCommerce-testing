/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstoopproject;

/**
 *
 * @author I-SEVEN
 */
public class Employee {
   int emp_id; String name; String deprt;
   boolean resident;
   double bouns;
  double salary;
  public Employee(){ emp_id= 100;name="Raghda";deprt="consumer";salary=10000;bouns=999;resident=true;}
  public Employee(int id , String na){emp_id=id;name=na;}
  public Employee(int id , String na,boolean re ){this (id,na);resident=re;}
  public Employee(int id , String na,String de ,double s , double bo,boolean re ){this(id,na,re);deprt=de;salary=s;bouns=bo;}
  public void print_emp_data(){
      System.out.println("id " + emp_id);  
      System.out.println("name " + name);
      System.out.println("deprt " + deprt);
      System.out.println("salary " + salary);
      System.out.println("bouns " + bouns);
      System.out.println("resident " + resident);
  }
}
