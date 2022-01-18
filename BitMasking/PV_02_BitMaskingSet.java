public class PV_02_BitMaskingSet {
    static public void main(String args[]){
        int n = 4;
        int position = 3;
        int bitMask = 1<<position;

        System.out.println("The value is:"+(bitMask | n));
        
    }
}
