public class PV_02_PowerSet {
    static void poweSet(String s, String curr, int i){
        if(i == s.length()){
            System.out.println(curr);
            return;
        }

        poweSet(s, curr + s.charAt(i), i+1);
        poweSet(s, curr, i+1);

    }
    public static void main(String[] args) {
        poweSet("abc", "", 0);
        
    }
}
