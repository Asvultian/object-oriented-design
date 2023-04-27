/**
 * complex
 */
class Complex implements Cloneable, Comparable<Complex> {
    private double a;
    private double b;

    public Complex(){

    }
    Complex(double a_in, double b_in){
        this.a = a_in;
        this.b = b_in;

    }
    public double getRealPart(){
        return a;
    }
    public double getImaginaryPart(){
        return b;
    }
    public Complex add(Complex secondComplex){
        double newA = a+secondComplex.a;
        double newB = b+ secondComplex.b;
        return new Complex(newA, newB);
    }
    public Complex subtract(Complex secondComplex){
        //stilll needs to be implemented
        return new Complex(newA, newB);
    }
    public Complex multiply(Complex secondComplex){
        double newA = a* secondComplex.a - b*secondComplex.b;
        double newB = b* secondComplex.a +a*secondComplex.b;
        return new Complex(newA, newB);
    }

    public double abs(){
        return Math.sqrt(a*a+b*b);
    }


    @Override
    public String toString(){
        
        if(b!=0){
            return a +" + "+b+"i";
        }
        
        return a+"";
    }
    


    
    
    
    
}
/**
 * assignmentF
 */
public class assignmentF {
    
    public static void main(String[] args) {
        
             System.out.println("Starting here");
        
             /*
              * We have to implement all the classes in the slides and the only imported
              * functionallity that we can use is the square root function
              */
        
    }
}