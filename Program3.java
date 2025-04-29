
package oopj;
class Game{
    void play(String name,int n){
        System.out.println("Cricket");
    }
    void play(int n,String name){
        System.out.println("Football");
    }
}
public class Program3 {
    public static void main(String[]  args){
        Game g=new Game();
        g.play("Virat",18);
        g.play(10,"Messi");
    }
}
//Polymorphism(sequence of argumnet);
