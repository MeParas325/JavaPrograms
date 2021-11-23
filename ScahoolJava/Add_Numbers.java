class Text
{
    public int num1;
    public int num2;
    public int ans;

    public void get_val(){
        num1 = 24;
        num2 = 45;
    }

    public void cal_cal(){
        ans = num1 + num2;
    }

    public void display(){
        System.out.println(ans);
    }
}

public class Add_Numbers
{
    public static void main(String[] args) {
        Text obj1 = new Text();
        obj1.get_val();
        obj1.cal_cal();
        obj1.display();

    }
}