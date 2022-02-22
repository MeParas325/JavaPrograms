class Test3{
     Test3(){
         System.out.println("Constructor called!");
     }
}
public class PV_10_this {
    public static void main(String args[]){
        Test3 obj = new Test3();
        Test3 obj3 = obj;

    }
}
