import java.lang.reflect.Type;

public class PV_01_VarDemo{
    static public void main(String args[]){
        // Use type inference to determine the type of the variable.
        // In that case double is inferred
        var avg = 10.0;
        System.out.println(avg);
        System.out.println(((Object)avg).getClass().getSimpleName());

        // In the following context, var is not a predefined identifier
        // It is simply a user-defined variable name
        int var = 1;
        System.out.println(var);
        System.out.println(((Object)var).getClass().getSimpleName());

        // Interestingly, in the following sequence, var is used
        // as both the type of the declaration and as a variable name
        // int the initializer
        var k = -var;
        System.out.println(k);
        System.out.println(((Object)k).getClass().getSimpleName());

        var name = "Paras";
        System.out.println(name);
        System.out.println(((Object)name).getClass().getSimpleName());

        var arr = new int[4];
        System.out.println(arr);

        // var arr = {1,2,3}; //Invalid code
        // System.out.println(arr2); //This will give you an error

        int arr2[] = new int[4];
        arr2[0] = 4;
        arr2[1] = 5;
        arr2[2] = 6;
        arr2[3] = 7;
        System.out.println("Elements of arr2:"+arr2);

        var arr3 = new int[4];
        arr3[0] = 4;
        arr3[1] = 5;
        arr3[2] = 6;
        arr3[3] = 7;
        for(int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }


    }
}