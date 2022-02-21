class OuterClass{
    private int outer_x = 100;

    private void test(){
        InnerClass1 obj = new InnerClass1();
        obj.display();
    }

    class InnerClass1{
        void display(){
            System.out.println("The value of outer_x is:"+outer_x);
        }

    }
}
public class PV_02_InnerClass {
    public static void main(String args[]){
        OuterClass obj = new OuterClass();
        System.out.println(obj.outer_x);
        obj.test();

        //This program will give you an error because we use here private access modifier just remove all privates and this wil run properly then


    }
    
}
