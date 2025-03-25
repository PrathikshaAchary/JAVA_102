/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMV
 */
public class Program30 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n/2||j==n-1){
                System.out.print("*"+" ");
            }
                else{
            System.out.print(" "+" ");
        }
    }
    System.out.println();
}
    }}