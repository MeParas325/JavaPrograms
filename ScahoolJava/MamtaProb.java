// package ScahoolJava;
interface MyInterface{
    public void colour();
    public void shape();
    public void area();
}

class Rectangle implements MyInterface{

    public void show(){
        System.out.print("Details of Rectangle is showing");
    }

    public void colour(){
        System.out.println("Colour is red");
    }

    public void shape(){
        System.out.println("Shape is rectangular");
    }

    public void area(){
        System.out.println("Area of Rectangle");
    }
}
class Circle implements MyInterface{

    public void show(){
        System.out.print("Details of Circle is showing");
    }

    public void colour(){
        System.out.println("Colour is blue");
    }

    public void shape(){
        System.out.println("Shape is Circular");
    }

    public void area(){
        System.out.println("Area of Circle");
    }
}
class Square implements MyInterface{

    public void show(){
        System.out.print("Details of Square is showing");
    }

    public void colour(){
        System.out.println("Colour is Orange");
    }

    public void shape(){
        System.out.println("Shape is Square");
    }

    public void area(){
        System.out.println("Area of Square");
    }
}
public class MamtaProb{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.show();
        rect.colour();
        rect.shape();
        rect.area();

        Circle circ = new Circle();
        circ.show();
        circ.area();
        circ.colour();
        circ.shape();

        Square sq = new Square();
        sq.show();
        sq.area();
        sq.shape();
        sq.colour();
    }
}
