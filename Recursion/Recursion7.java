class Recursion1{
    int values[];

    Recursion1(int i){
        values = new int[i];
    }

    void printArray(int size){
        if(size < 0) return;
        else printArray(size-1);
        System.out.println("["+size+"]"+" "+values[size]);

    }
}
public class Recursion7 {
    public static void main(String args[]){

        Recursion1 obj = new Recursion1(10);

        for(int i = 0; i<10; i++)obj.values[i] = i;

        obj.printArray(10-1);
    }
}
