class Test2{
    public static int v1, v2, ans;
    public static void getInp(){
        v1 = 23;
        v2 = 61;
    }
    public static void calVal(){
        ans = v1 + v2;
    }
    public static void display(){
        System.out.println(ans);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Test2.getInp();
        Test2.calVal();
        Test2.display();
        Test2 obj1 = new Test2();
        obj1.getInp();
        obj1.calVal();
        obj1.display();
    }
}
