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
public class Automorphic {
    public static void main(String[] args){
        int a=25;
        int sq=a*a;
        if(sq%10==a){
            System.out.println(a+"Automorphic number");
        }
        else{
            System.out.println(a+"is not Automorphic number");
            
        }
    }
}
