class CheckedException extends Exception{
    CheckedException(){
        super("You cannot vote");
    }
    CheckedException(String msg){
        super(msg);
    }
}
public class PV_06_Throw{
    public static void main(String args[]){

        int age = 17;
        try{
            if(age<18){
                throw new CheckedException("You are not eligible to vote.");
            }
            else{
                System.out.println("You can vote");
            }
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}