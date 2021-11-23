class WrongTypeRadiusException extends Exception{
     public String toString(){
         return "Wrong radius input";
     }

     public String getMessage(){
        return "Please input the correct input";
     }
}

public class PV_84_Throws {
    static double area(Double r)throws WrongTypeRadiusException{
        if(r<0){
            throw new WrongTypeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    static int divide(int a, int b)throws ArithmeticException{
            int result = a/b;
            return result;
    }
    public static void main(String[] args) {

        try{
            // int c = divide(3, 0);
            double a = area(0.5);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
