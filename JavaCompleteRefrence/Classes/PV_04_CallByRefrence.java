class MyClass1{
    int a , b;
    MyClass1(int i, int j){
        a = i;
        b = j;
    }
    void meth(MyClass1 obj){
        obj.a*=2;
        obj.a*=2;
    }
}
public class PV_04_CallByRefrence {
    public static void main(String args[]){
        MyClass1 obj = new MyClass1(15, 30);
        System.out.println("Value of a and b before changing it by call by refrence is:"+obj.a+" "+obj.b);
        obj.meth(obj);
        System.out.println("Value of a and b after changing it by call by refrence is:"+obj.a+" "+obj.b);

        

    }
}
