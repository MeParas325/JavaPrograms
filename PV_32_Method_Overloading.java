class PV_32_Method_Overloading{
    static void food(int a){
        System.out.println(a+" is passing by the user in this function");
    }

    static void food(int a, int b){
        System.out.println(a+" is passing by the user in this function"+b+"also passing by the function");
    }

    static void food(){
        System.out.println("Hello gyus how are you");
    }

    static void change(int a){
        a = 40;
    }

    static void change2(int arr[]){
        arr[0] = 49;
    }
    static void tellJoke(){
        System.out.println("Hey Paras!Whats your name.");
    }

    public static void main(String[] args) {
        // tellJoke();

        // Changing the Integer
        // int x = 34;
        // change(x);
        // System.out.println(x);
        
        // Changing the Array
        // int arr[] = {23, 12, 56, 78};
        // change2(arr);
        // System.out.println("The value of marks 1 is:"+arr[0]);

        // Method Overloading
        // food();
        // food(3000);
        // food(30000, 34545);

        // Another way to access static methods by class name
        PV_32_Method_Overloading.food();
        PV_32_Method_Overloading.food(3000);
        PV_32_Method_Overloading.food(30000, 34545);

    }
}
