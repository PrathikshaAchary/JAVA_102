/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java102;

/**
 *
 * @author SMV
 */
public class Program20 {
     public static  void main(String[] args){
        int age=20;
        if(age<12){
            System.out.println("Minor");
           
        }
        else if(age>=13&&age<60){
        System.out.println("Normal");}
        else if(age>60){
            System.out.println("senior citizens");
        }
        
}}
