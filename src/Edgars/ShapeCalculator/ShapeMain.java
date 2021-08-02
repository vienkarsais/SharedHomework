package Edgars.ShapeCalculator;
import Edgars.ShapeCalculator.Shapes.Circle;
import Edgars.ShapeCalculator.Shapes.Rectangle;
import Edgars.ShapeCalculator.Shapes.Shape;
import Edgars.ShapeCalculator.Shapes.Triangle;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(15, 25);
        Shape triangle = new Triangle(5,4,6);
        Shape[] shapes = {circle, triangle, rectangle,};

        for (Shape s : shapes){
            s.printArea();
            s.printPerimeter();
            System.out.println();
        }
    }
}