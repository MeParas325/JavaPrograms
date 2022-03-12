package mypack;
class Three{
    String name;
    double bal;
    Three(String name, double bal){
        this.name = name;
        this.bal = bal;
    }

    void show(){
        if(bal<0){
            System.out.println("Minimum account balance person details is:");
            System.out.println(name+":$"+bal);
        }

        else{
            System.out.println("Balance is ohk.");
        }
    }
}

public class PV_02_Packages {
    static public void main(String arhs[]){
        Three currentPerson[] = new Three[3];

        currentPerson[0] = new Three("Paras", 34.56);
        currentPerson[1] = new Three("Tannu", 34.90);
        currentPerson[2] = new Three("Shiva", -1);

        for(int i = 0; i<3; i++) currentPerson[i].show();

    }
}
