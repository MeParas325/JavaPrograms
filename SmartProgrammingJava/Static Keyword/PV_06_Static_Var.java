class PV_06_Static_Var {
    static int a = 1;

    void display(){
        System.out.println("Displaying method of class 06:"+a);
    }

    public static void main(String[] args) {
        PV_06_Static_Var obj = new PV_06_Static_Var();
        obj.display();
    }
}
