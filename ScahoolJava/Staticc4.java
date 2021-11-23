class Test{
    public static int num1;
    public static int num2 = 20;

    public static void display(){
        System.out.println(num1+"-"+num2);
    }
}

public class Staticc4{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        System.out.println(Test.num1+"-"+Test.num2);
        System.out.println(Test.num1+"-"+Test.num2);

        Test.num1 = 50;
        Test.num2 = 80;

        System.out.println(Test.num1+"-"+Test.num2);
        System.out.println(Test.num1+"-"+Test.num2);

        Test.num1 = 500;
        Test.num2 = 800;
        
        System.out.println(Test.num1+"-"+Test.num2);
        System.out.println(Test.num1+"-"+Test.num2);

        Test.num1 = 50;
        Test.num2 = 80;

        System.out.println(Test.num1+"-"+Test.num2);
        System.out.println(Test.num1+"-"+Test.num2);

        Test.num1 = 500;
        Test.num2 = 800;
        
        System.out.println(Test.num1+"-"+Test.num2);
        System.out.println(Test.num1+"-"+Test.num2);

    }
}
