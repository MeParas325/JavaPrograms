public class PV_01_StringBuilder{
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Paras verma");
        // System.out.println(sb);
        // sb.append(" is a good boy");
        // System.out.println(sb);

        // StringBuffer sb = new StringBuffer(1000);
        // System.out.println(sb.capacity());
        // sb.append(" is a good boy");
        // System.out.println(sb);
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append(" is a good boy ");
        // System.out.println(sb);

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append(" is not a good boy ");
        // System.out.println(sb);
        // System.out.println(sb.capacity());

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append(" is not a good boy or as well as not a bad boy");
        // System.out.println(sb);
        // System.out.println(sb.capacity());

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append(" is not a good boy or as well as not a bad boy jgkf dfjfoi dfdjg dfgkjkgj dkftigj");
        // System.out.println(sb);
        // System.out.println(sb.capacity());

        // StringBuffer sb = new StringBuffer("Paras");
        // System.out.println(sb.capacity());
        // sb.ensureCapacity(100);
        // sb.append(" is not a good boy or as well as not a bad boy jgkf dfjfoi dfdjg dfgkjkgj dkftigj sdfjhj fdbndfifgu fjif");
        // System.out.println(sb);
        // System.out.println(sb.capacity());

        StringBuffer sb = new StringBuffer("Paras");
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.append("Verma");
        sb.trimToSize();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}