
abstract class Shape 
{
    double dimension1, dimension2;
    Shape(double x, double y)
    {
        dimension1 = x;
        dimension2 = y;
    }
    abstract double area();
}
class Rectangle extends Shape
{
    Rectangle(double x, double y)
    {
        super(x,y);
    }
    double area()
    {
        System.out.print("Area of Rectangle : ");
        return dimension1*dimension2;
    }
}
class Square extends Shape
{
    Square(double x)
    {
        super(x,x);
    }
    double area()
    {
        System.out.print("Area of Square : ");
        return dimension1*dimension2;
    }

}
class Triangle extends Shape
{
    Triangle(double x, double y)
    {
        super(x,y);
    }
    double area()
    {
        System.out.print("Area of Triangle : ");
        return (dimension1*dimension2)/2;
    }
}
class PV_12_AbstractClass
{
    public static void main(String[] args) {
        double ar;
        Shape sh;
        Rectangle r = new Rectangle(10, 3);
        Square s = new Square(20);
        Triangle t = new Triangle(10,15);
        sh = r;
        ar = sh.area();
        System.out.print(ar + "\n");
        sh = s;
        ar = sh.area();
        System.out.print(ar + "\n");
        sh = t;
        ar = sh.area();
        System.out.print(ar + "\n");
    }
}
