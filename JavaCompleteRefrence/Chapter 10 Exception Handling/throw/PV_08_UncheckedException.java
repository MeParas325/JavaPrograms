class UncheckedException extends RuntimeException{
    UncheckedException(){
        super("You cannot vote");
    }
    UncheckedException(String msg){
        super(msg);
    }
}
public class PV_08_UncheckedException{
    public static void main(String args[])throws UncheckedException{

        int age = 17;
        if(age<18){
             throw new UncheckedException("You are not eligible to vote.");
        }
        else{
            System.out.println("You can vote");
        }
        System.out.println("hello");
    }
}