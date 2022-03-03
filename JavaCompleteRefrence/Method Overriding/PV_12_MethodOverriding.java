class ParentClass3{
    void show()throws Exception{
        System.out.println("ParentClass3 method.");

    }
}
class PV_12_MethodOverriding extends ParentClass3{
    void show()throws ArithmeticException{
        System.out.println("Main class method.");
    }
    static public void main(String args[]){
        PV_12_MethodOverriding obj = new PV_12_MethodOverriding();
        obj.show();

        ParentClass3 t = new ParentClass3();
        try{
            t.show();
        }catch(Exception e){
            System.out.println(e+" Error aa gya bhai.");
        }
    }
}