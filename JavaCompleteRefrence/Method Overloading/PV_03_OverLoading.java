public class PV_03_OverLoading {
    
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 6};
        System.out.println("1");

        PV_03_OverLoading obj = new PV_03_OverLoading();
        PV_03_OverLoading.main(4);

        obj.main(arr);
    }

    public static void main(int args){
        System.out.println("2");
        System.out.println(args);
    }

    public static void main(int a[]){
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }


}
