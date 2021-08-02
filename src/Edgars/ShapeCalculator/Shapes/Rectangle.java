package Edgars.ShapeCalculator.Shapes;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double areaCalc(){
        return sideA * sideB;
    }

    public double perimeterCalc(){
        return (sideA + sideB) * 2;
    }
}
