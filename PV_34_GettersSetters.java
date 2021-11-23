class Solution{
    private int num1;
    private String name;
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(){
        num1 = 23;
    }
    public int getId(){
        return num1;
    }
}
public class PV_34_GettersSetters {
    public static void main(String[] args) {
        Solution obj = new Solution();
        // obj.num1 = 23;
        // obj.name = "Paras";
        obj.setName("Paras");
        System.out.println(obj.getName());
    }

}