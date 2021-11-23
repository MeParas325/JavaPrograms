class Employee{
    static int a = 0;
    Employee(){
        a++;
        System.out.println("Counting Employees....");
    }

}


public class PV_08_Static_Var{
    public static void main(String[] args) {
        Employee obj = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        Employee obj4 = new Employee();

        System.out.println("No of object:"+Employee.a);
    }
}
