class PV_10_Counting_Objects {
    static int count;
    PV_10_Counting_Objects(){
        count++;
    }
    public static void main(String[] args) {
        PV_10_Counting_Objects obj1 = new PV_10_Counting_Objects();
        PV_10_Counting_Objects obj2 = new PV_10_Counting_Objects();
        PV_10_Counting_Objects obj3 = new PV_10_Counting_Objects();
        PV_10_Counting_Objects obj4 = new PV_10_Counting_Objects();

        System.out.println("No of object is:"+count);
       
    }
}
