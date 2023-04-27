
import java.util.Scanner;

/*
 * auther Steven Nguyen
 * Test Function
 * assignmentF
 */
public class assignmentF {

    public static void main(String[] args) {

        // System.out.println("Starting here");

        /*
         * We have to implement all the classes in the slides and the only imported
         * functionallity that we can use is the square root function
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);
        System.out.print("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);
        System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = "
                + c1.add(c2));
        System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = "
                + c1.subtract(c2));
        System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = "
                + c1.multiply(c2));
        System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = "
                + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());
        Complex c3 = (Complex) c1.clone();
        System.out.println(c1 == c3);
        System.out.println(c3.getRealPart());
        System.out.println(c3.getImaginaryPart());
        if (c1.compareTo(c2) == 1) {
            System.out.println("C1 is the same as C2");
        } else {
            System.out.println("C1 is not the same as C2");
        }
        input.close();
    }
}
/**
 * complex
 */
class Complex implements Cloneable, Comparable<Complex> {
    private double a;
    private double b;

    public Complex() {

    }

    public Complex(double a_in) {
        this.a = a_in;
        this.b = 0;
    }

    Complex(double a_in, double b_in) {
        this.a = a_in;
        this.b = b_in;

    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex secondComplex) {
        double newA = a + secondComplex.a;
        double newB = b + secondComplex.b;
        return new Complex(newA, newB);
    }

    public Complex subtract(Complex secondComplex) {
        // stilll needs to be implemented
        double newA = a - secondComplex.a;
        double newB = b - secondComplex.b;
        return new Complex(newA, newB);
    }

    public Complex multiply(Complex secondComplex) {
        double newA = a * secondComplex.a - b * secondComplex.b;
        double newB = b * secondComplex.a + a * secondComplex.b;
        return new Complex(newA, newB);
    }

    public Complex divide(Complex secondComplex) {
        double newA = (a * secondComplex.a + b * secondComplex.b)
                / ((secondComplex.a * secondComplex.a) + (secondComplex.b * secondComplex.b));
        double newB = (b * secondComplex.a - a * secondComplex.b)
                / ((secondComplex.a * secondComplex.a) + (secondComplex.b * secondComplex.b));
        return new Complex(newA, newB);
    }
    public double abs() {
        return Math.sqrt(a * a + b * b);
    }
    @Override
    public String toString() {

        if (b != 0) {
            return a + " + " + b + "i";
        }

        return a + "";
    }
    @Override
    public int compareTo(Complex c) {
        if ((c.a == this.a) && (c.b == this.b))
            return 1;
        else {
            return 0;
        }
    }

    @Override
    public Complex clone() {
        return new Complex(this.a, this.b);
    }
}
