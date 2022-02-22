class MyClass{
    int i;
    MyClass(int k){
        i = k;
    }

    void geti(){
        System.out.println("Value of i in MyClass is:"+i);
    }

    void seti(int j){
        if(j>i){
            i = j;
        }
        System.out.println("The new value of i is:"+i);

    }

}
public class PV_01_typeInference{
    public static void main(String args[]){
        var MyClass = new MyClass(10);
        MyClass.geti();
        MyClass.seti(90);



    }
}