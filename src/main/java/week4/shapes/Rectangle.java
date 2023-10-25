package week4.shapes;

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void displayInfo()
    {
        System.out.println(this.getColor() + ", " + this.getFillType() + ", " + this.getHeight() + ", " + this.getWidth() + ", " + this.getArea());
    }

    @Override
    public double getArea()
    {
        return this.getHeight()*this.getWidth();
    }
}
