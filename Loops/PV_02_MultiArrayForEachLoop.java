public class PV_02_MultiArrayForEachLoop {
    static public void main(String args[]){
        int arr[][] = {{1, 2},
                       {22, 33},
                       {55, 7}};
        
        for(int element[] : arr){for(int j : element)System.out.print(j+" ");System.out.println();}
    }
}
