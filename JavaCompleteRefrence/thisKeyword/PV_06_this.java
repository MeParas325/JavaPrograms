public class PV_06_this {
    PV_06_this meth1(){
        return this;
    }
    static public void main(String arg[]){
        PV_06_this obj = new PV_06_this();
        System.out.println(obj.meth1());
        System.out.println(obj);

        PV_06_this obj2;
        obj2 = obj.meth1();
        System.out.println(obj2);

        obj = null;
        System.out.println("After assigning obj:"+obj);
        System.out.println(obj2);
    }
}
