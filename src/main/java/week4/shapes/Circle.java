package week4.shapes;

class Circle extends Shape{
    final double pi = 3.14;
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void displayInfo()
    {
        System.out.println(this.getColor() + ", " + this.getFillType() + ", " + this.getRadius() + ", " + this.getArea());
    }

    @Override
    public double getArea()
    {
        return pi*this.getRadius()*this.getRadius();
    }

    public double calculateCircumference(double PI, double r)
    {
        return 2*PI*r;
    }

    public double calculateCircumference(double r)
    {
        return 2*pi*r;
    }
}
