package fr.tbr.exercises.geometry;
import fr.tbr.exercises.geometry.quadrilateral;

public class square extends quadrilateral{


    public square(double w, double h) {
        super(w, h);
    }

    public double getArea() {
        return width * height;
    }
    // Calc perimeter
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
