public class Rational {


    public String toString() {
	return numerator + "/" + denominator;
    }
    public void multiply(Rational i) {
	numerator *= i.getNumerator();
	denominator *= i.getDenominator();
    }
    public void divide() {
    }
}

