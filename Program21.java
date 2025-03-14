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
public class Program21 {
    public static void main(String[] args){
        int age=18;
        char gender= 'M';
        if(gender=='M'||gender=='m')
        {
            if(age>19){
                System.out.println("Eligible Bachelor");
            }
            else
            {
                System.out.println("Not Eligible Bachelor");
            }
        }
        else if(gender=='F'||gender=='f'){
            if(age>18){
                System.out.println("Eligible Spinster");
            }
            else{
                System.out.println("Not Eligible Spinster");
            }
        }
    }
}
