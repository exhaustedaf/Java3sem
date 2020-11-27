public class ComplexTest {
    public static void main(String[] args) {
        Complex x = new Complex(23,4);
        System.out.println(x);
        ComplexAbstractFactory fac = new ConcreteFactory();
        Complex y = fac.createComplex(8,7);
        System.out.println(y);
        ConcreteFactory d = new ConcreteFactory();
        Complex z = d.createComplex(5,2);
        System.out.println(z);
    }
}