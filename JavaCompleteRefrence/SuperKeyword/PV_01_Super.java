class Super1{
    int i;
}
public class PV_01_Super extends Super1{
    int i = 10;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);

    }
    public static void main(String args[]){
        PV_01_Super obj = new PV_01_Super();
        obj.show(30);

    }
}