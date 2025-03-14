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
public class Program18 {
    public static  void main(String[] args){
        int n=12;
        if(n%2==0&&n%3==0){
            System.out.println("Java");
           
        }
        else if(n%2==0){
        System.out.println("Python");}
        else if(n%3==0){
            System.out.println("C/C++");
        }
        else
            System.out.println(".net");
        
    }
}
