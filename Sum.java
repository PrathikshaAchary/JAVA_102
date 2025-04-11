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
public class Sum {
    public static void main(String[] args){
        int n=12345;
        int rem=0;
        int sum=0;
        int mul=1;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            mul=mul*rem;
            n=n/10;
        }
        System.out.println(sum);
        System.out.print(mul);
        }
}
