public class PV_01_Classes{
    public static void main(String args[]){
        PV_01_Classes obj = new PV_01_Classes();
        System.out.println(obj);

        PV_01_Classes obj2 = new PV_01_Classes();
        System.out.println(obj2);

        PV_01_Classes obj3 = new PV_01_Classes();
        System.out.println(obj3);

        PV_01_Classes obj4 = new PV_01_Classes();
        System.out.println(obj4);

        PV_01_Classes obj5 = obj4;
        System.out.println(obj5);

        obj4 = null;
        System.out.println(obj4);
        System.out.println(obj5);


    }
}