// left shifting a byte value
public class PV_05_LeftShiftByte {
    static public void main(String args[]){
        byte a = 64;
        int i = a<<2;
        byte b = (byte)(i<<2);
        byte c = (byte)(i>>1);
        byte d = (byte)(i>>2);
        
        System.out.println(a);
        System.out.println(i);
        System.out.println("After right shift:"+b);
        System.out.println("After left shift:"+c);
        System.out.println("Again After left shift:"+d);

    }
}
