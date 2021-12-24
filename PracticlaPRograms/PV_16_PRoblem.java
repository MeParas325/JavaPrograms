interface Shape 
{
    abstract double area();
}
class Rectangle implements Shape
{
    double dimension1, dimension2;
    Rectangle(double x, double y)
    {
        dimension1 = x;
        dimension2 = y;
    }
    public double area()
    {
        System.out.print("Area of Rectangle : ");
        return dimension1*dimension2;
    }
}
class Square implements Shape
{
    double dimension1;
    Square(double x)
    {
        dimension1 = x;
    }
    public double area()
    {
        System.out.print("Area of Square : ");
        return dimension1*dimension1;
    }

}
class Triangle implements Shape
{
    double dimension1, dimension2;
    Triangle(double x, double y)
    {
        dimension1 = x;
        dimension2 = y;
    }
    public double area()
    {
        System.out.print("Area of Triangle : ");
        return (dimension1*dimension2)/2;
    }
}
class PV_16_PRoblem
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
