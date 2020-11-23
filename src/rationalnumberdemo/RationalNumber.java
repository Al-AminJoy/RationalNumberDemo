package rationalnumberdemo;

/**
 *
 * @author Al-Amin Islam <alaminislam3555@gmail.com>
 */
public class RationalNumber {

    public int numerator;
    public int denometor;

    public RationalNumber(int numerator, int denometor) {
        this.numerator = numerator;
        this.denometor = denometor;
    }

    public RationalNumber add(RationalNumber that) {
        int n = this.numerator * that.denometor + this.denometor * that.numerator;
        int d = this.denometor * that.denometor;
        RationalNumber result = new RationalNumber(n, d);
        return result;
    }

    public boolean equals(Object o) {
        RationalNumber that = (RationalNumber) o;
        if (this.denometor * that.numerator == that.denometor * this.numerator) {
            return true;
        } else {
            return false;
        }
    }
}
