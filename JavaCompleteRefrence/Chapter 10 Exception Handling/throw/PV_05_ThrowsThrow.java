class CheckedException extends Exception{
    CheckedException(){
        super("You cannot vote");
    }
    CheckedException(String msg){
        super(msg);
    }
}
public class PV_05_ThrowsThrow{
    public static void main(String args[])throws CheckedException{

        int age = 17;

        if(age<18){
            throw new CheckedException("You are not eligible to vote.");
        }
        else{
            System.out.println("You can vote");
        }
        System.out.println("hello");
    }
}