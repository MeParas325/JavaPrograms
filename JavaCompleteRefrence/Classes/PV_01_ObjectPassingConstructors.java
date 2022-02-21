class DemoClass{
    double height;
    double width;
    double length;

    DemoClass(DemoClass obj){
        height = obj.height;
        width = obj.width;
        length = obj.length;
    }

    DemoClass(double len){
        height = width = length = len;
    }

    DemoClass(){
        width = -1;
        height = -1;
        length = -1;
    }

    DemoClass(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume(){
        return width*height*length;
    }
}
public class PV_01_ObjectPassingConstructors {
    public static void main(String args[]){
        DemoClass obj1 = new DemoClass();
        System.out.println("Volume of obj1 is:"+obj1.volume());

        DemoClass obj2 = new DemoClass(10, 20, 6);
        System.out.println("Volume of obj2 is:"+obj2.volume());

        DemoClass obj3 = new DemoClass(obj2);
        System.out.println("Volume of obj3 is:"+obj3.volume());

        DemoClass obj4 = new DemoClass(5);
        System.out.println("Volume of obj4 is:"+obj4.volume());
        

    }
}
