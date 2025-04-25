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
public class PrimeNo_0to100 {
    public static boolean isPrimeNumber(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Prime numbers between 0 and 100 are:");
        for(int i=0;i<=100;i++){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
        
            }
        }
    }
}
