class Static {
    static int a = 3;
    static int b;

    static void callMe(){
        b = 4;
        a = b * 4;
        System.out.println("CallMe method called!");
    }

    static{
        System.out.println("Static Block initialized!");
    }
}

class PV_11_Static{
    public static void main(String args[]){
        System.out.println("Value of a and b in class Static is:"+Static.a+" "+Static.b);
        Static.callMe();
        System.out.println("Value of a and b after calling callMe function:"+Static.a+" "+Static.b);
    }
}
