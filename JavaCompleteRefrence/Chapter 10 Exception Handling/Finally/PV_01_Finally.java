public class PV_01_Finally{
    public static void main(String args[]){
        try{
            int c = 100/0;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("I am in the finally block.");
        }
    }
}