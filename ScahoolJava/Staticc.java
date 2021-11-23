class Test{
    public int num1;
    public static int num2 = 20;

    public void display(){
        System.out.println(num1+"-"+num2);
    }
}

public class Staticc{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        System.out.println(t1.num1+"-"+t1.num2);
        System.out.println(t2.num1+"-"+t2.num2);

        t1.num1 = 50;
        t1.num2 = 80;

        System.out.println(t1.num1+"-"+t1.num2);
        System.out.println(t2.num1+"-"+t2.num2);

        t1.num1 = 500;
        t1.num2 = 800;
        
        System.out.println(t1.num1+"-"+t1.num2);
        System.out.println(t2.num1+"-"+t2.num2);

        t2.num1 = 50;
        t2.num2 = 80;

        System.out.println(t1.num1+"-"+t1.num2);
        System.out.println(t2.num1+"-"+t2.num2);

        t2.num1 = 500;
        t2.num2 = 800;
        
        System.out.println(t1.num1+"-"+t1.num2);
        System.out.println(t2.num1+"-"+t2.num2);

    }
}