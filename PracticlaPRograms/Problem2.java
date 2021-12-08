class Student{
    int roll_no;
    int age;
    String name;
    String course;

    Student(int roll_no, String name, int age, String course){
        this.roll_no = roll_no;
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public void display(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
        System.out.println("Roll no is:"+roll_no);
        System.out.println("Course is:"+course);
    }
}

public class Problem2{
    static public void main(String args[]){
        Student obj = new Student(12, "Paras", 19, "BCA");
        obj.display();
    }
}
