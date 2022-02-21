class Test1{
    int a;

    Test1(int i){
        a = i;
    }

    Test1 inCreTen(){
        Test1 temp = new Test1(a+10);
        return temp;
    }
}
public class PV_05_ReturningObject {
    static public void main(String args[]){
        Test1 obj1 = new Test1(2);
        Test1 obj2;

        obj2 = obj1.inCreTen();

        System.out.println("obj1.a:"+obj1.a);
        System.out.println("obj2.a:"+obj2.a);

        obj2 = obj2.inCreTen();

        System.out.println("After increment obj2.a:"+obj2.a);



    }
}
