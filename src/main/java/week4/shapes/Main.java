package week4.shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Green", FillType.FILLED, 3.5 );
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 2.5, 2.5);

        circle.displayInfo();
        rectangle.displayInfo();
    }
}
