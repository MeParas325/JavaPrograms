class ParentClass1{
    void show()throws ArithmeticException{
        System.out.println("ParentClass1 method.");

    }
}
class PV_10_MethodOverriding extends ParentClass1{
    void show()throws ArithmeticException{
        System.out.println("Main class method.");
    }
    static public void main(String args[]){
        PV_10_MethodOverriding obj = new PV_10_MethodOverriding();
        obj.show();

        ParentClass t = new ParentClass();
        t.show();
    }
}