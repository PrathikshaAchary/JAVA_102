/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgm1;

/**
 *
 * @author SMV
 */
public class Count {
    public static void main(String[] args){
        int n=1234;
        int count=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println("The count is:" +count);
    }
}
