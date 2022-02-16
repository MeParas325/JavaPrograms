public class PV_06_Ternary {
    static public void main(String args[]){
        int k, i = 10;
        k = i<0 ? -i:i;
        
        System.out.println("Value of k and i is:"+k+" "+i);

        i = -10;
        k = i<0 ? -i:i;
        System.out.println("Value of k and i is:"+k+" "+i);

    }
}
