class MyStack2 implements StackInterface{
    private int stack[];
    private int top;

    MyStack2(int a){
        stack = new int[a];
        top = -1;
    }

    public void push(int a){
        if(top == stack.length -1){
            int temp[] = new int[stack.length * 2];
            for(int i = 0; i<stack.length; i++)temp[i] = stack[i];
            stack = temp;
        }
        else{
            stack[++top] = a;
        }
    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack is empty.");
            return -1;
        }
        else{
            return stack[top--];
        }
    }
}

public class PV_04_StackInterface {
    public static void main(String args[]){
        MyStack2 obj = new MyStack2(5);
        MyStack2 obj2 = new MyStack2(10);

        for(int i = 0; i<10; i++)obj.push(i);
        for(int i = 0; i<20; i++)obj2.push(i);

        for(int i = 0; i<10; i++)System.out.println(obj.pop());
        for(int i = 0; i<20; i++)System.out.println(obj2.pop());
      

    }
}
