public class PV_01_LabbledBreak{
    public static void main(String args[]){
       outer: for(int i = 1; i<=4;i++)
        {
           inner: for(int j = 0; j<i; j++){
                if(i == 2)break inner;
                System.out.print(j+" ");
             }
             System.out.println();
        }
    }
}