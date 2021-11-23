class Solution{
    public int num1;
    public static int num2 = 20;
    public void display(){
        System.out.println(num1 + " _ " + num2);
    }
}

public class Test{
    public static void main(String[] args) {
        Solution obj =  new Solution();
        obj.display();
        
        Solution obj2 = new Solution();
        System.out.println(obj2.num1 + " _ " + Solution.num2+"_"+Solution.num2+"_"+obj.num2);

        obj.num1 = 50;
        Solution.num2 = 80;
        obj.num2 = 100;
        System.out.println(obj.num1 + " _ " + Solution.num2);
        System.out.println(obj2.num1 + " _ " + obj2.num2);
    }
}