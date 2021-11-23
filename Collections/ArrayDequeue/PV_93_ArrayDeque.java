import java.util.ArrayDeque;

public class PV_93_ArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(4);
        ad1.add(6);
        ad1.addFirst(1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}