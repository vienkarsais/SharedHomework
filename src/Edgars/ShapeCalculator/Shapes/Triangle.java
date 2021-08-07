package Edgars.ShapeCalculator.Shapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double areaCalc() {
        double semiP = (sideA + sideB + sideC) /2;
        double result = Math.sqrt(semiP * (semiP - sideA)*(semiP - sideB) * (semiP - sideC));
        return Math.round(result * 100.0) / 100.0;
    }
    public double perimeterCalc() {
        return sideA + sideB + sideC;
    }
}
