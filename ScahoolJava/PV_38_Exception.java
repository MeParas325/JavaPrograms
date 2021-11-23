class PV_38_Exception {
    public static void main(String[] args) {

        int i = 7;
        int j = 0;
        System.out.println("Well done");
        try {
            int m = i/j; 
        } catch (Exception e) {

            System.out.println("Divison error occurs.");
            System.out.println("Well done your variable value is wrong");

        }
    }
}

