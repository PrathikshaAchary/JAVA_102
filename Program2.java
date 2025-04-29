
package oopj;
class City
{
    void place(int a){
         System.out.println("Chennai");
    
}
    void place(int a,int b)
    {
        System.out.println("udupi");
    }
   void place(int a,int b,int c){
       System.out.println("Pune");
   }
}
public class Program2 {
    public static void main(String[] args){
        City c=new City();
        c.place(10);
        c.place(10,20);
        c.place(10,20,30);
    }
    
}
//Method Overloading;