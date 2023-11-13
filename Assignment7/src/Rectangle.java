public class Rectangle extends Shapes {

    private double length;
    private double width;

    //Constructor classes
    public Rectangle(){
        this(0,0);
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Set width method
    public void setWidth(double width){
        this.width = width;
    }

    //Return width value
    public double getWidth(){
        return this.width;
    }

    //Set length method
    public void setLength(double length){
        this.length = length;
    }

    //Return length value
    public double getLength(){
        return this.length;
    }

    //To String method
    public String toString(){
        return "This is a rectangle of area: " + this.area + " Length: " + this.length + " Width: " + this.width;
    }

    //Calculate area of rectangle object
    public void calculateArea(){
        this.area = this.width * this.length;
    }
}
