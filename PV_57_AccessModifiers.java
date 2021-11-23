class c2{
    public static int x = 23;
    protected static int z = 56;
    static int d = 67;
    private static int y = 4;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);
    }
}

class C1 extends c2{
    public void meth2(){
        System.out.println(x);
        System.out.println(z);
        // System.out.println(y);
        System.out.println(d);
    }
}


public class PV_57_AccessModifiers {
    public static void main(String[] args) {
        c2 obj = new c2();
        obj.meth1();
        System.out.println(c2.x);
        // System.out.println(c2.y); //Cannot access because its a private variable and you cannot access somebody private thing
        System.out.println(c2.z);
        System.out.println(c2.d);

        C1 obj2 = new C1();
        obj2.meth2();

        System.out.println("Trying Dispatch Method");
        c2 obj3 = new C1();
        obj3.meth1();


    }
}
