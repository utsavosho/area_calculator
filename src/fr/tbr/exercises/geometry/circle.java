package fr.tbr.exercises.geometry;

public class circle {
    //the way to define a private constant : private static final
    private static final double PI = Math.PI;

    //this is the radius of the circle
    private double radius;

    /**
     * The constructor to create a circle with a radius equal to the given parameter
     * @param r the radius of the circle to be created
     */
    public circle (double r){
        this.radius = r;
    }

    /**
     * compute the area of the circle
     * @return the area
     */
    public double getArea(){
        return PI * this.radius * this.radius;
    }

    /**
     * compute the perimeter of the circle
     * @return the perimeter
     */
    public double getPerimeter(){
        return 2 * PI * this.radius;
    }
}
