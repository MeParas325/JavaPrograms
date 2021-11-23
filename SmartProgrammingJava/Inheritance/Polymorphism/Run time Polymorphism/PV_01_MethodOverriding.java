class KuxVRakhDo{
    public void myFunc(){
        System.out.println(" I am the method of KuxVRakhDO");
    }
}

class PV_01_MethodOverriding extends KuxVRakhDo{
    public void myFunc(){
        System.out.println("I am the method of PV_01_MethodOverloading");
    }
    public static void main(String[] args) {
        PV_01_MethodOverriding obj = new PV_01_MethodOverriding();
        obj.myFunc();
        KuxVRakhDo obj2 = new KuxVRakhDo();
        obj2.myFunc();
    }
}