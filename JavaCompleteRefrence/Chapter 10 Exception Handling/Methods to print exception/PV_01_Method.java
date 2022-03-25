public class PV_01_Method{
    public static void main(String args[]){
        try{
            int c = 100/0;
        }catch(Exception e){
            // System.out.println(e); //This will not print the stacktrace
            // System.out.println(e.getMessage()); //This will not print the stacktrace and also the type of exception
            e.printStackTrace(); //This will print all the details about the exception
        }
    }
}