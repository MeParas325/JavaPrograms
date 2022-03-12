class MyStack implements StackInterface{
    private int stack[];
    private int tos;

    MyStack(int a){
        stack = new int[a];
        tos = -1;
    }

    public void push(int a){
        if(tos == stack.length - 1){
            System.out.println("Stack is full.");
            return;
        }
        else{
            stack[++tos] = a;
        }
    }

    public int pop(){
        if(tos == -1){
            System.out.println("Stack is empty.");
            return -1;
        }
        else{
            return stack[tos--];
        }
    }

}

public class PV_03_StackInterface {

    public static void main(String ags[]){
        MyStack stk1 = new MyStack(5);
        MyStack stk2 = new MyStack(10);

        // Pushing elements into the both stacks
        for(int i = 0; i<5; i++)stk1.push(i);
        for(int i = 0; i<10; i++)stk2.push(i);
        
        System.out.println("Popping the elements of stack1:");
        for(int i = 0; i<5; i++)System.out.println(stk1.pop());
        System.out.println("Popping the elements of stack2:");
        for(int i = 0; i<10; i++)System.out.println(stk2.pop());

    }
}
