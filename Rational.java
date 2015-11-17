public class Rational {
    private int numerator;
    private int denominator;
    public int getNum() {
	return numerator;
    }
    public int getDenom() {
	return denominator;
    }
    public Rational() {
	numerator = 0;
	denominator = 1;
    }
    public Rational(int n,int d) {
	numerator = n;
	denominator = d;
    }
    public double floatValue() {
	return n/(d*1.);
    }

    public String toString() {
	return numerator + "/" + denominator;
    }
    public void multiply(Rational i) {
	numerator *= i.getNum();
	denominator *= i.getDenom();
    }
    public void divide() {
	numerator /= i.getNum();
	denominator /= i.getDenom();
    }
}

