class Stack1{
    private int stack[] = new int[10];
    private int top;

    Stack1(){
        top = -1;
    }

    void push(int i){
        if(top == 9) System.out.println("Stack is full!");
        else stack[++top] = i;
    }

    int pop(){
        if(top<0){
            System.out.println("Stack is empty!");
            return -1;
        }
        else return stack[top--];

    }
}
public class PV_01_StackPrivate{
    public static void main(String args[]){

        Stack1 obj = new Stack1();
        Stack1 obj2 = new Stack1();
        
        System.out.println("Pushing and popping the element of 1st object:");
        for(int i = 0; i<10; i++) obj.push(i);
        for(int i = 0; i<10; i++) System.out.println("Popping "+(10-i)+" Element:"+obj.pop());

        System.out.println("Pushing and popping the element of 2nd object:");
        for(int i = 10; i<20; i++) obj2.push(i);
        for(int i = 10; i<20; i++) System.out.println("Popping "+(20-i)+" Element:"+obj2.pop());

    }
}