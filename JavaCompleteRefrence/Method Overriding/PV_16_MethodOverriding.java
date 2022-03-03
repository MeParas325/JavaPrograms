class ParentClass7{
    void show()throws Exception{
        System.out.println("ParentClass7 method.");

    }
}
class PV_16_MethodOverriding extends ParentClass7{
    void show()throws Exception{
        super.show();
        System.out.println("Main class method.");
    }
    static public void main(String args[]){
        PV_16_MethodOverriding obj = new PV_16_MethodOverriding();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Error aa gya hai re.");
        }

        ParentClass7 t = new ParentClass7();
        try{
            t.show();
        }catch(Exception e){
            System.out.println(e+" Error aa gya bhai.");
        }
    }
}