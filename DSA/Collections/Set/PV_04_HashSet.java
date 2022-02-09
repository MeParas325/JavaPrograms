import java.util.HashSet;
import java.util.Set;

public class PV_04_HashSet{
    public static void main(String args[]){
        Set<Integer> set = new HashSet<>();
        System.out.println(set);

        set.add(4);
        set.add(-4);
        set.add(-40);
        set.add(44);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(4));
        System.out.println(set.contains(3));

        set.remove(4);
        System.out.println(set);
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());

    }
}