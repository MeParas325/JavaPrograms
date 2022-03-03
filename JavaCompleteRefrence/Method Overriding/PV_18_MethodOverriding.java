abstract class Abstract2{
    abstract protected void show();
}

public class PV_18_MethodOverriding extends Abstract2 {
    public void show(){
        System.out.println("Showing the overridden method of abstract class.");
    }
    static public void main(String args[]){
        PV_18_MethodOverriding obj = new PV_18_MethodOverriding();
        obj.show();
    }
    
}
