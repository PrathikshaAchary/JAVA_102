
package stack;

public class StackImplementation
{
    int[]stack;
    int capacity;
    int top;
    StackImplementation(int size)
    {
        stack = new int[size];
        capacity =size;
        top =-1;
    }
    void push(int x)
    {
        if(top==capacity-1)
        {
            System.out.println("Overflow state");
        }
        else
        {
            top++;
            stack[top]=x;
            System.out.println("Inserted Element:"+x);
          
        }}
        boolean isEmpty()
        {
            if(top==-1)
            {
                return true;
                
                
            }
            else
            {
                return false;
                        
            }
        }
        void pop()
        {
            if(isEmpty())
            {
                System.out.println("Underflow state");
                
            }
            else
            {
                System.out.println(stack[top]+" "+"popped");
                top--;
            }
        }
        
    

    public static void main(String[] args)
    {
      StackImplementation si=new StackImplementation(3);
      si.push(10);
      si.push(20);
      si.push(30);
      si.push(40);
      System.out.println(si.isEmpty());
      si.pop();
      si.pop();
    }
    
}
//Inserted Element:10
//Inserted Element:20
//Inserted Element:30
//Overflow state