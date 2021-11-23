class PV_80_Try{
    public static void main(String[] args) {
        int a = 40;
        int b = 0;

        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println("Exception occurs:");
            System.out.println(e);
        }

        System.out.println("Program ends");
    }
}