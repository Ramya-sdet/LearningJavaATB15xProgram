package Oops_Coding;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circ = new Circle(4);

        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Circle Area: " + circ.getArea());
    }
}

