package fr.tbr.exercises.geometry;

public class triangle {
        private double sideA;
        private double sideB;
        private double sideC;
        private double breath;
        private double height;

        // Defining a constructor
        public triangle(double a, double b, double c    , double h) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
            this.height = h;

        }

        // Calc Area of Triangle
        public double getArea() {
            return 0.5 * sideC * height;
        }



        // Calc perimeter
        public double getPerimeter(){
            return sideA + sideB + sideC;
        }



}
