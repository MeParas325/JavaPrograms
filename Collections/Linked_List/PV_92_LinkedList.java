import java.util.*;

public class PV_92_LinkedList{
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(33);
        l2.add(33);
        l2.addLast(344);
        l2.addFirst(444);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(1, 6);
        l1.add(1, 7);
        l1.add(2, 8);
        l1.addAll(2, l2);
        System.out.println(l1.contains(33));
        System.out.println(l1.contains(1009));
        System.out.println(l1.indexOf(33));
        System.out.println(l1.lastIndexOf(33));
        System.out.println(l1.lastIndexOf(2));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.remove(0));
        System.out.println(l1.contains(1));
        System.out.println(l1.isEmpty());
        
        LinkedList<Integer> l3 = new LinkedList<>();
        System.out.println(l1.subList(5, 12));

        // l1.clear();

        for(int i  = 0;i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

        for(int j = 0; j<l3.size(); j++){
            System.out.println("Inside first for loop");
            l3.set(j, l2.get(j));
        }
        
        for(int i = 0; i<l3.size(); i++){
            System.out.println("Inside of for loop");
            System.out.println(l3.get(i));
        }
    }
}