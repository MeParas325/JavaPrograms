class ParentClass2{
    void show()throws ArithmeticException{
        System.out.println("ParentClass2 method.");

    }
}
class PV_11_MethodOverriding extends ParentClass2{
    void show()throws Exception{
        System.out.println("Main class method.");
    }
    static public void main(String args[]){
        PV_11_MethodOverriding obj = new PV_11_MethodOverriding();
        obj.show();

        ParentClass2 t = new ParentClass2();
        t.show();
        //this program will give you an error because you have to throw the low level error in child class.
    }
}