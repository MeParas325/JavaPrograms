class Test{
    static int count;
    Test(){
        System.out.println("Constructor called");
        count++;
    }

    static void Kiase_Ho(String n){
        System.out.println(n);
    }
}
public class Babita {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        Test t5 = new Test();
        Test t6 = new Test();

        System.out.println(t1.count);
    }
}