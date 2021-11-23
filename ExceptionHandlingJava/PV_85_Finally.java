public class PV_85_Finally {
    public static int greet(){
        try{
            int a = 5;
            int b = 9;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning the resources of this function");
        }
        return -1;
    }

    public static int myFunc(){
        int i;
        for(i = 5; i>=0; i--){
            if(i == 2){
                return 0;
            }
            try{
                int a = 5;
                int b = i;
                int c = a/b;
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("Cleaning the resources of MyFunc function");
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println(myFunc());
    }
}
