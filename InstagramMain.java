
package oopj;
class instagram1{
    void post(){
        {
            System.out.println("Photos");
        }}}
class instagram2 extends instagram1{
    @Override
    void post(){
        super.post();
        System.out.println("Photos,Videos");
        
    }
}
class instagram3 extends instagram2{
    @Override
    void post(){
        super.post();
        System.out.println("Photos,Video,Reels");
        
    }
}

  

    
public class InstagramMain {
    public static void main(String[] args) {
        instagram3 in = new instagram3();
        in.post();

    }
    
}
