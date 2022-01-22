public class PV_08_StaticMethod{
    static int i = 0;
    PV_08_StaticMethod(){
        objMeth();
    }
    static public void objMeth(){
        i = i + 1;
    }
    static public void main(String args[]){
        PV_08_StaticMethod obj1 = new PV_08_StaticMethod();
        PV_08_StaticMethod obj2 = new PV_08_StaticMethod();
        PV_08_StaticMethod obj3 = new PV_08_StaticMethod();
        System.out.println("No of Objects:"+ i);

    }
}