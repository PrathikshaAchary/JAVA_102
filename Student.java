/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopj;

/**
 *
 * @author SMV
 */
public class Student {
    int age=10;
    String name="Tom";
void read()
{
    System.out.println("Read");
}
public static void main(String[] args){
    System.out.println("Program Starts");
    Student s=new Student();
    System.out.println(s.age);
     System.out.println(s.name);
     s.read();
     System.out.println("Program Ends");
}
}
