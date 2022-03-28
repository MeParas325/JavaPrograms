class UncheckedException extends RuntimeException{
    UncheckedException(){
        super("You cannot vote");
    }
    UncheckedException(String msg){
        super(msg);
    }
}
public class PV_09_UncheckedException{
    public static void main(String args[])throws UncheckedException{

        int age = 17;
        try{
            if(age<18){
                 throw new UncheckedException("You are not eligible to vote.");
            }
            else{
                System.out.println("You can vote");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("hello");
    }
}