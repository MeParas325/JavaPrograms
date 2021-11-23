class NegativeRadiusException extends Exception{
    public void toString(){
        System.out.println("Radius cannot be negative");
    }

    public void getMessage(){
        System.out.println(" Radius ridaadmak nhi ho skti");
    }
}


public class PV_Throw_Throws {
    public static double area(int r){
        double area = Math.PI * r * r;
        return result;
    }
    public static int divide (int a, int b)throws MyExceptionClass{
        //Made by me
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try{
            int c = divide(4, 2);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(c);
    }
}
