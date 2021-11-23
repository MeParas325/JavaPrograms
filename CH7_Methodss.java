public class CH7_Methodss {
        int sum(int a, int b){
            int sum = a + b;
            // System.out.println(sum);
            return sum;
        }
        public static void main(String[] args) {
        int a = 5;
        int b = 7;
        CH7_Methodss obj = new CH7_Methodss();
        int sum = obj.sum(a, b);
        System.out.println(sum);
    }
}
