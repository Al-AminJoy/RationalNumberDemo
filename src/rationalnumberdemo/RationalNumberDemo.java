package rationalnumberdemo;

/**
 *
 * @author Al-Amin Islam <alaminislam3555@gmail.com>
 */
public class RationalNumberDemo {

    public static void main(String[] args) {
        /*
        Worked in Test Package
        */
        RationalNumber r2=new RationalNumber(6,3);
        RationalNumber r1=new RationalNumber(2,3);
        RationalNumber result = r1.add(r2);
        System.out.println("Result : "+result.numerator);
    }
    
}
