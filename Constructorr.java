class Test{
    Test(){
        System.out.println("I am the Constructor");
    }
    Test(int i, String name){
        System.out.println(name + i);
    }

}
    
    
public class Constructorr {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(23, "Paras");
    }
}
