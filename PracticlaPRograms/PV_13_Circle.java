class PV_13_Circle 
{
    final double pi = 3.14;
    final double radius = 14;

    double Circumference()
    {
        return 2*pi*radius;
    }
    double Area()
    {
        return pi*radius*radius;
    }
    public static void main(String[] args) {
        PV_13_Circle c = new PV_13_Circle();
        System.out.println("Circumference of circle : "+ c.Circumference());
        System.out.println("Area of circle : "+ c.Area());
    }
}
