public class Quadratic {
    private double a;
    private double b;
    private double c;

    public Quadratic(){
        this.a = 1.0;
        this.b = 0.0;
        this.c = 0.0;
    }
    public Quadratic( double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Quadratic(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Quadratic(double a){
        this.a = a;
    }
    public double getDiscriminant(){
        return Math.pow(b, 2) - 4*a*c;

    }
    public double getAos(){
        return -b / 2*a;

    }
    public void findRoots(){
        if (getDiscriminant() > 0){
            System.out.println("Your quadratic has 2 real roots");
            double root1 = ((-this.b + Math.sqrt(getDiscriminant())));
            root1 = Math.round( root1 *100.0)/ 100.0; 

            double root2 = ((this.b - Math.sqrt(getDiscriminant())));
            root2 = Math.round( root2 *100.0)/ 100.0; 
            System.out.println("The roots are x = " +root1 + " and " +root2);
        }
        else if (getDiscriminant() == 0){
            System.out.println("Your Quadratic has 1 real root");
            double root1 = getAos();
            root1 = Math.round( root1 *100.0)/ 100.0; 
            System.out.println("The root is x = " +root1);

        }
    }
    public void findVertex(){
        

    }

}
