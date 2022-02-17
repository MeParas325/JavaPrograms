public class PV_09_ForLoop {
    static public void main(String args[]){
        int value = 4;
        int arr[] = {1, 2, 3, 5, 4, 6, 8};
        boolean var = false;

        for (int element : arr) if(element == value){ var = true; break;}

        if(var)System.out.println("Element is found.");
        else System.out.println("Element is not found.");
    }
}
