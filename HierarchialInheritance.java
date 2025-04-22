/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
class Person
{
void human()
{
    System.out.println("He is a human");
    
}
}
class Walk extends Person
{
    void disp()
    {
        System.out.println("Executing walk class");
        
    }
}
class Run extends Person
{
    void show()
    {
        System.out.println("Executibg run calss");
    }
    }
public class HierarchialInheritance{
    public static void main(String[] args){
        Walk w=new Walk();
        w.human();
        w.disp();
        
        Run r = new Run();
        r.human();
        r.show();
    }
}




















