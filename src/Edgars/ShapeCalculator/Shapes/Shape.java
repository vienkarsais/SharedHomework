package Edgars.ShapeCalculator.Shapes;

import Edgars.ShapeCalculator.ShapesInterfaces.IPrint;
import Edgars.ShapeCalculator.ShapesInterfaces.IShape;
public abstract class Shape implements IShape, IPrint {

    public abstract double areaCalc();

    public abstract double perimeterCalc();

    public void printArea(){
        System.out.println("Area of this " + this.getClass().getSimpleName() + ": " + areaCalc());
    }

    public void printPerimeter(){
        System.out.println("Perimeter of this " + this.getClass().getSimpleName() + ": " + perimeterCalc());
    }
}
