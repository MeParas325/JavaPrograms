class ParentClass{
    void show()throws ArithmeticException{
        System.out.println("ParentClass method.");

    }
}
class PV_09_MethodOverriding extends ParentClass{
    void show(){
        System.out.println("Main class method.");
    }
    static public void main(String args[]){
        PV_09_MethodOverriding obj = new PV_09_MethodOverriding();
        obj.show();

        ParentClass p = new ParentClass();
        p.show();
    }
}