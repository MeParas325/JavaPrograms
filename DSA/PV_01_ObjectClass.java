class Animal{
    void animal(){
        System.out.println("I am an normal animal");
    }

}

class Domestic{
    void domestic(){
        System.out.println("I am a domestic animal");
    }

}



public class PV_01_ObjectClass{
    public static void main(String args[]){
        Object[] obj = new Object[5];
        obj[0] = new Animal();
        obj[1] = new Domestic();
        obj[2] = 'c';
        obj[3] = 1;
        obj[4] = "Paras";

        System.out.println(obj[0]);
        System.out.println(obj[1]);
        System.out.println(obj[2]);
        System.out.println(obj[3]);
        System.out.println(obj[4]);
    }
}