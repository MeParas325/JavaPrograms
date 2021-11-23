// import java.util.Scanner;
public class employee
{
	int emp_id;
	String emp_name;
	String emp_company;
	employee(int emp_id, String emp_name, String emp_company) 
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_company = emp_company;
	}
	void display() 
	{
		System.out.println("emloyee  id ="  +emp_id);
		System.out.println("employee name ="  +emp_name);
		System.out.println("employee company ="  +emp_company);
	}
	public static void main(String []args)
	{
		employee e1 = new employee(112, "Tarun", "google");
		e1.display();
		employee e2 = new employee(190, "rahul", "ms office");
		e2.display();
	}
}