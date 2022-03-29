package fr.tbr.exercises.geometry;
import fr.tbr.exercises.geometry.triangle;
public class trianglecalculator {
    public static void main(String[] args){
    triangle CalcArea = new triangle(20, 30 , 40,14.5 );

    System.out.println("Triangle perimeter : " + CalcArea.getPerimeter() + ", area : " + CalcArea.getArea());
}
}
