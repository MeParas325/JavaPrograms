class ParentClass5{
    void show(){
        System.out.println("ParentClass5 method.");

    }
}
class PV_14_MethodOverriding extends ParentClass5{
    void show()throws ArithmeticException{
        System.out.println("Main class method.");
    }
    static public void main(String args[]){
        PV_14_MethodOverriding obj = new PV_14_MethodOverriding();
        obj.show();

        ParentClass5 t = new ParentClass5();
        try{
            t.show();
        }catch(Exception e){
            System.out.println(e+" Error aa gya bhai.");
        }
    }
}