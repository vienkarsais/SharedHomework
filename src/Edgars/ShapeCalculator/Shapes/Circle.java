package Edgars.ShapeCalculator.Shapes;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double areaCalc() {
        double result = Math.pow(radius, 2) * Math.PI;
        return Math.round(result * 100.0) / 100.0;
    }

    public double perimeterCalc() {
        double result = 2 * radius * Math.PI;
        return Math.round(result * 100.0) / 100.0;
    }
}
