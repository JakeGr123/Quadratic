public class main {
    public static void main(String[] args){
        Quadratic quad1 = new Quadratic(4, 17);
        System.out.println(quad1.getDiscriminant());
        quad1.findRoots();
        quad1.findVertex();
        Quadratic quad2 = new Quadratic(-3);
        System.out.println(quad2.getDiscriminant());
        quad2.findRoots();
        quad2.findVertex();
        Quadratic quad3 = new Quadratic(3, 3, 9);
        System.out.println(quad3.getDiscriminant());
        quad3.findRoots();
        quad3.findVertex();
        Quadratic quad4 = new Quadratic();
        System.out.println(quad4.getDiscriminant());
        quad4.findRoots();
        quad4.findVertex();
    }
}
