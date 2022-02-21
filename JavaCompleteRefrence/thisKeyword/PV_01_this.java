public class PV_01_this{
    void test(){
        this.display();
    }
    void display(){
        System.out.println("Displaying......");
    }
    public static void main(String args[]){
        PV_01_this obj =  new PV_01_this();
        obj.test();
        PV_01_this obj2 = obj;
        System.out.println(obj2 == obj);
    }

}