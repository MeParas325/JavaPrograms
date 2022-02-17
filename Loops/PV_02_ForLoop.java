public class PV_02_ForLoop {
    static public void main(String args[]){
        int i = 0;
        boolean done = false;
        System.out.println(!done);
        for(; !done ; ){
            System.out.println(i);
            i++;
            if(i == 10) done = true;
        }
    }
}