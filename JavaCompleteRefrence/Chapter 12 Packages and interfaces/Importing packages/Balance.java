package mypack;

public class Balance{
    int a;
    public Balance(int a){
        this.a = a;
    }

    public void show(){
        if(a == 0){
            System.out.println("Your account balance is too low.");
        }

    }
}