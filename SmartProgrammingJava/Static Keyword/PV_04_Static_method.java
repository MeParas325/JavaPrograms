class PV_04_Static_method{
    static int i;
    static void display(){
        i = i+1;
        // System.out.println("The value of i is:"+this.i); //SWe cannot use this keyword in static method
        System.out.println("The value of i is:"+i);
        show();
        System.out.println("Displaying the method");
    }
    static void show(){
        System.out.println("Showing the Showing method");
    }
    public static void main(String[] args) {
        PV_04_Static_method.display();
        System.out.println(i);
    }
}


