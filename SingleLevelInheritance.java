/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

class Beta{
    void print()
    {
        System.out.println("executing Print()....");
        
    }
}
class Gama extends Beta
{
    
}
public class SingleLevelInheritance {
    public static void main(String[] args){
        Gama g= new Gama();
        g.print();
    }
}
