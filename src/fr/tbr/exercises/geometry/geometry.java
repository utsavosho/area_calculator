package fr.tbr.exercises.geometry;

public class geometry {
    public static void main(String[] args) {
        circle smallCircle = new circle(20);
        circle bigCircle = new circle(60);

        System.out.println("Small circle perimeter : " + smallCircle.getPerimeter() + ", area : " + smallCircle.getArea());
        System.out.println("Big circle perimeter : " + bigCircle.getPerimeter() + ", area : " + bigCircle.getArea());

    }
}
