class Stack{
    int stack[] = new int[10];
    int top = -1;

    void push(int i)
    {
        if(top == 9) return;
        else stack[++top] = i;
    }
    
    int pop()
    {
        if(top == -1){
            System.out.println("Stack is empty!");
            return 0;
        }
        else return stack[top--];
    }
            
}
public class PV_02_Classes {
    static public void main(String args[]){

        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // Pushing all the elements for both of the objects of stack class
        for(int i = 0; i<10; i++) myStack1.push(i);
        for(int i = 10; i<20; i++) myStack2.push(i);

        // Popping all the elements of both of the objects of stack class
        System.out.println("Popping all the elements myStack1:");
        for(int i = 0; i<10; i++) System.out.println(myStack1.pop());
        System.out.println("Popping all the elements myStack2:");
        for(int i = 0; i<10; i++) System.out.println(myStack2.pop());
    }
}
