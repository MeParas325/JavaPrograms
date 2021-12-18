class Mathh{
    float areatr;
    float areasq;
    float arearect;

    public Mathh(float b, int h){
        areatr = 1*(b*h)/2;
        System.out.println("Area of Traingle is:"+areatr);
    }

    public Mathh(int a, int b){
        areasq = a*b;
        System.out.println("Area of Square is:"+areasq);
    }

    public Mathh(int a, float b){
        arearect = a*b;
        System.out.println("Area of Rectangle is:"+arearect);
    }
}
public class PV_10_MethodOverLoading{
    static public void main(String args[]){
        Mathh obj = new Mathh(4.4f, 5);
        Mathh obj2 = new Mathh(4, 4);
        Mathh obj3 = new Mathh(4, 5.5f);
    }
}