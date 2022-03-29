package fr.tbr.exercises.geometry;

import fr.tbr.exercises.geometry.square;


public class squarecalculator {
    public static void main(String[] args){
        square CalcArea = new square(10,10 );

        System.out.println("square perimeter : " + CalcArea.getPerimeter() + ", area : " + CalcArea.getArea());

    }
}