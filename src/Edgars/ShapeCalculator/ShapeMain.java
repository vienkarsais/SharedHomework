package Edgars.ShapeCalculator;


import Edgars.ShapeCalculator.Shapes.*;


public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(15, 25);
        Shape triangle = new Triangle(5,4,6);
        Shape rectangle2 = new Rectangle(38, 48);
        Shape[] shapes = {circle, triangle, rectangle, rectangle2};

        for (Shape s : shapes){
            s.printArea();
            s.printPerimeter();
            System.out.println();
        }
    }
}