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
public class pgm5 {
    static void run()
    {
        System.out.println("Executing run()...");
    }
    static void mul(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }
    static String name()
    {
     return "SMVITM";
    }
    static boolean res(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        run();
        mul(2,3,2);
        System.out.println(name());
        boolean ans=res(5);
        System.out.println(ans);
        }
    }

