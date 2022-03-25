public class PV_04_Finally {
    public static void main(String args[]){
        try{
            try{
                int c = 100/0;
            }
            finally{
                System.out.println("I am in the finally block.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("After the execution of finally block.");
    }
}
