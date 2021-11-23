class Sum{
    int ans;
    Sum(int a, int b){
        ans = a + b;
        System.out.println(ans);
    }
    
    Sum(int a, int b, int c){
        ans = a + b + c;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Sum obj = new Sum(23, 56);
        Sum obj2 = new Sum(23, 56, 6);
    }
}