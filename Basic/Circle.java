interface Rollable {
    void roll(float degree);
}

abstract class Shape {
    abstract double area();

    private Shape parentShape;

    public void setParentShape(Shape shape) {
        parentShape = shape;
    }

    public Shape getParentShape() {
        return parentShape;
    }
}

abstract class CircularShape extends Shape implements Rollable {
}

public class Circle extends CircularShape {
    private int xPos, yPos, radius;

    public Circle(int xPos, int yPos, int radius) {
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void roll(float degree) {
        System.out.print(degree);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 10);
        circle.roll(45);
       // Object
       // String
       Integer
    }
}