class MyClass{
    void meth(int i, int j){
        i*=2;
        j*=2;

    }
}
public class PV_03_CallByValue {
    public static void main(String args[]){
        MyClass obj = new MyClass();
        int a = 15, b = 30;

        System.out.println("Value of a and b before Changing by call by value:"+a+" "+b);
        obj.meth(a, b);
        System.out.println("Value of a and b after Chnaging by call by value:"+a+" "+b);


    }
}
