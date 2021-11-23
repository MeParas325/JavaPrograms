class Test{
    public int a;
    public String naam;
    static String crs = "BCA";
    
    void get_val(int i, String name){
        a = i;
        naam = name;
    }
    public void display(){
        System.out.println(a + naam + crs);
    }

}
    
    
public class Constructorr3{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.get_val(23, "Paras");
        t1.display();
        t2.get_val(27, "Lokesh");
        t2.display();
    }
}

