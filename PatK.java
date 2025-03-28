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
public class PatK {
   
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||i+j==n/2||i-j==n/2){
                System.out.print("*"+" ");
            }
                else{
            System.out.print(" "+" ");
        }
    }
    System.out.println();
}
    }}
}
