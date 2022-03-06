class A{
    public interface ChildInterface{
        Boolean isNegative(int a);
    }
}
public class PV_01_NestedInterface implements A.ChildInterface{
    public  Boolean isNegative(int i){
        return i<0 ? false : true;
    }
    public static void main(String args[]){
        A.ChildInterface obj = new PV_01_NestedInterface();
        if(obj.isNegative(4))System.out.println("No is positive.");

        else if(obj.isNegative(-12))System.out.println("This wont be displayed.");

    }
}