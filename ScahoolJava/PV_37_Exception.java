class PV_37_Exception {
    public static void main(String[] args) {
        int i = 7;
        int j = 1;
        int m = 0;
        System.out.println("Well done your answer is wrong");
        try {
            m = i/j;
        }catch (Exception e) {
            //TODO: handle exception
            System.out.println("Division error occurs");
            System.out.println(e);
        }
        
        System.out.println(m);
        System.out.println("Enter correct input");
    }
}
