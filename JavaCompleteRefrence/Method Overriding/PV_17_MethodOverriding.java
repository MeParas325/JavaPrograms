abstract class Abstract1{
    abstract public void show();
}

public class PV_17_MethodOverriding extends Abstract1 {
    public void show(){
        System.out.println("Showing the overridden method of abstract class.");
    }
    static public void main(String args[]){
        PV_17_MethodOverriding obj = new PV_17_MethodOverriding();
        obj.show();

    }
    
}
