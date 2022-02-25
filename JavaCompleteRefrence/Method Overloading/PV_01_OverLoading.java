class A{
    int i, j;
    A(int i, int j){
        this.i = i;
        this.j = j;
    }

    void show(){
        System.out.println("I am the method of A class.");
        System.out.println(i+" "+ j);
    }

    void show2(){
        System.out.println("I am the second method of A class.");
    }
}

class B extends A{
    int i, j ,k;
    B(int i, int j, int k){
        super(i, j);
        this.i = i;
        this.j = j;
        this.k = k;
    }

    void show(){
        super.show();
        super.show2();
        System.out.println("I am the method of B class.");
        System.out.println(i+" "+j+" "+k);
    }
}
public class PV_01_OverLoading{
    public static void main(String args[]){
        B obj = new B(10, 20, 30);
        obj.show();
    }
}