interface G{
    default void show(){
        System.out.println("I am the show method of G Interface.");
    }

}

interface H{
    default void show(){
        System.out.println("I am the show method of H interface.");
    }

}


public class PV_04_MultipleInheritanceInterfaces implements G, H{

    static public void main(String args[]){
        PV_04_MultipleInheritanceInterfaces obj = new PV_04_MultipleInheritanceInterfaces();
        obj.show();

    }

    //this program will give you an error because you try to accress the show method which is already avalible in both interfaces.

}

