public class PV_01_BitMaskingGet{
    static public void main(String args[]){
        int n = 5;
        int bitMask = 1<<3;

        if((bitMask & n) == 0){
             System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}