class Solution{
    private int num1;
    private static String name;
    
    public static String getName(){
        return name;
    }
    public static void setName(String n){
        name = n;
    }
    public void setId(){
        num1 = 23;
    }
    public int getId(){
        return num1;
    }
}
public class PV_35_GettersSetters extends Solution{
    public static void main(String[] args) {
        // Solution obj = new Solution();
        // obj.num1 = 23;
        // obj.name = "Paras";
        setName("Paras");
        System.out.println(getName());
    }

}
