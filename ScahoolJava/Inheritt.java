class test{
    public int num1;
    public int num2;
    public int ans;

    public void get_val(){
        num1 = 34;
        num2 = 45;
    }

    public void cal_val(){
        ans = num1 + num2;
    }

    public void display(){
        System.out.println(ans);
    }
}

class text extends test{
    public int num11;
    public int num22;
    public int answer;

    public void get_value(){
        num11 = 34;
        num22 = 45;
    }

    public void cal_value(){
        answer = num11 * num22;
    }

    public void displays(){
        System.out.println(answer);
    }
}

public class Inheritt {
   public static void main(String[] args) {
        test obj1 = new test();
        obj1.get_val();
        obj1.cal_val();
        obj1.display();

        text obj2 = new text();
        obj2.get_value();
        obj2.cal_value();
        obj2.displays();

        text obj3 = new text();
        obj3.get_val();
        obj3.cal_val();
        obj3.display();


    }
}













