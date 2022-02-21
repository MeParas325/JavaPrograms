public class PV_10_Static {
    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println("x:"+x);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    static{
        System.out.println("Static Block initialized!");
        b = 4*3;
    }
    public static void main(String args[]){
        meth(42);
        System.out.println("Value of b is:"+b);
        System.out.println("Value of b by using className:"+PV_10_Static.b);
    }
}
