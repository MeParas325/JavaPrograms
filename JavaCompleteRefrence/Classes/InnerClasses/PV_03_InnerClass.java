class OuterClass{
    int outer_x = 100;

    void test(){
        InnerClass1 obj = new InnerClass1();
        obj.display();
    }

    class InnerClass1{
        int y = 41; 
        void display(){
            System.out.println("The value of outer_x is:"+outer_x);
        }
    }

    void show(){
        // System.out.println("Local variable of innerclass y is:"+y); //this will give you an error because y is not presenr in the scope of outerClass 
    }
}
public class PV_03_InnerClass {
    public static void main(String args[]){
        OuterClass obj = new OuterClass();
        System.out.println(obj.outer_x);
        obj.test();
        
    }
    
}
