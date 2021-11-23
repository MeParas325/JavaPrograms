class PV_05_Static_Variable {
    int clgid;
    String name;
    static String clg = "GEU";

    PV_05_Static_Variable(int clgid, String name){
         this.clgid = clgid;
         this.name = name;
    }

    void details(){
        System.out.println(clgid+" "+name+" "+clg);
    }
    public static void main(String[] args) {
        PV_05_Static_Variable obj1 = new PV_05_Static_Variable(100, "Paras");
        PV_05_Static_Variable obj2 = new PV_05_Static_Variable(200, "Tannu");

        obj1.details();
        obj2.details();
    }
}
