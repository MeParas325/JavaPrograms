public class PV_01_MulCatch{
    public static void main(String args[]){
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};

        try{
            int c = a/b;
            vals[10] = 10;
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("Multi-catch Program finished successfully.");
    }
}