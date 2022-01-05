class PV_01_Static_method{
    static int i = 10; 
    public static void main(String[] args) {
        PV_01_Static_method obj = new PV_01_Static_method();
        System.out.println(PV_01_Static_method.i);
        System.out.println(i);
        System.out.println(obj.i);
    }
}
