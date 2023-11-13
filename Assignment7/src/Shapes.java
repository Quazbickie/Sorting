import java.awt.*;
import java.io.Serializable;

public abstract class Shapes implements ShapesRelate, Serializable {

    protected double area;

    public Shapes() {

    }

    //Return area value
    public double getArea(){
        return this.area;
    }

    public abstract void calculateArea();

    //Method to compare area of two shapes
    public int compareShapes(ShapesRelate other){

        Shapes shape = (Shapes) other;

        //If this shape is bigger than other, return 1,
        //if it is smaller return -1,
        //otherwise return 0
        if(this.getArea() > shape.getArea()){
            return 1;
        } else if (this.getArea() < shape.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }



}
