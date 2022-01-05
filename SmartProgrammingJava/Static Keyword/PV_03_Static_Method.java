class PV_03_Static_Method{
    void display(){
        show();
        System.out.println("Displaying the method");
    }
    static void show(){
        System.out.println("Showing the Showing method");
    }
    public static void main(String[] args) {
        PV_03_Static_Method obj = new PV_03_Static_Method();
        obj.display();
        show();
    }
}


