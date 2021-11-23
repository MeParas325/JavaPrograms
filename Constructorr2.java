class Test{
    public int a;
    public String naam;
    public String crs;
    Test(){
        System.out.println("I am the Constructor");
    }
    Test(int i, String name, String course){
        System.out.println(name + i + course);
        a = i;
        naam = name;
        crs = course;
        System.out.print(a + naam + course);
    }

}
    
    
public class Constructorr2{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(23, "Paras", "BCA");
    }
}

