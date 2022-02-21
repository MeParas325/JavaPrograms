class Test2{
    Test2 meth1(){
        return this;
    }
}
public class PV_07_this {
    PV_07_this meth1(){
        return this;
    }
    static public void main(String arg[]){
        PV_07_this obj = new PV_07_this();
        System.out.println(obj.meth1());
        System.out.println(obj);

        PV_07_this obj2;
        obj2 = obj.meth1();
        System.out.println(obj2);

        obj = null;
        System.out.println("After assigning obj:"+obj);
        System.out.println(obj2);

        Test2 obj4 = new Test2();
        System.out.println("Printing the Obj of Test:"+obj4);
        System.out.println(obj4.meth1());
        Test2 obj5 = obj4.meth1();
        System.out.println(obj5);

    }
}
