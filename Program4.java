
package oopj;
class Amazon{
    void payment()
    {
        System.out.println("COD");}
     void payment(String name)
        {
            System.out.println("UPI Payment");
            
        }
    void payment(long cardnumber,int OTP){
        System.out.println("Card Payment;");
    }
    void payment(String username,String password){
        System.out.println("Net Banking");
    }
}
public class Program4 {
    public static void main(String[] args){
        Amazon a =new Amazon();
        a.payment();
        a.payment("Gpay");
        a.payment(123456789L,576227);
        a.payment("User@123","password");
        
    }
    
}
