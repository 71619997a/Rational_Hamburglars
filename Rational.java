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
	if (d!= 0) {
	    denominator = d;
	}
	else {
	    System.out.println("Naw. Undefined. Denominator set to 1.");
	    denominator = 1;
	}
    }
    public double floatValue() {
	return (double)numerator / denominator;
    }

    public String toString() {
	return numerator + "/" + denominator;
    }
    public void multiply(Rational i) {
	numerator *= i.getNum();
	denominator *= i.getDenom();
    }
    public void divide(Rational i) {
	numerator /= i.getNum();
	denominator /= i.getDenom();
    }
}

