/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author SMV
 */
public class Container {
    int capacity;
    Container(int a)
    {
        capacity=a;
    }
    public static void main(String[] args){
        Container c =new Container(500);
        System.out.println(c.capacity);
        Container c1 =new Container(1500);
        System.out.println(c1.capacity);
        Container c2 =new Container(2000);
        System.out.println(c2.capacity);
    }
}
