public class Circle extends Shapes {

    private double radius;
    private final double PI = Math.PI;

    //Constructors
    public Circle(){
        this(0.0);
    }

    public Circle(double rad){
        this.radius = rad;
    }

    //Set radius method
    public void setRadius(double rad){
        this.radius = rad;
    }

    //Return radius value
    public double getRadius(){
        return this.getRadius();
    }

    //Calculate area of Circle
    public void calculateArea(){
        this.area = PI * (radius*radius);
    }

    //To string
    public String toString(){
        return "This is a Circle of area: " + this.area + " Radius: " + this.radius;
    }



}
