class College{
    String name = "College Class";
    static class Student{
        public void display(){
            System.out.println("Student Class.");
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        College c1 = new College();
        System.out.println(c1.name);
        College.Student cs = new College.Student();
        cs.display();
    }
}
