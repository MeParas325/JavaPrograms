class ParentClass4{
    void show()throws Exception{
        System.out.println("ParentClass4 method.");

    }
}
class PV_13_MethodOverriding extends ParentClass4{
    void show(){
        System.out.println("Main class method.");
    }
    static public void main(String args[]){
        PV_13_MethodOverriding obj = new PV_13_MethodOverriding();
        obj.show();

        ParentClass4 t = new ParentClass4();
        try{
            t.show();
        }catch(Exception e){
            System.out.println(e+" Error aa gya bhai.");
        }
    }
}