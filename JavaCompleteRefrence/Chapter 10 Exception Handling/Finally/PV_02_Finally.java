public class PV_02_Finally {
    public static void main(String args[]){
        try{
            int c = 100/0;
        }
        finally{
            System.out.println("I am in the finally block.");
        }
        System.out.println("After the execution of finally block.");
    }
}
