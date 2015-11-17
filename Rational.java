/* Team Hamburglars: Sarah Yoon and Gabriel Marks
APCS1 pd10
HW32 -- Irrationality Stops Here
2015-11-17 */

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
	Rational recip = new Rational(i.getDenom(),i.getNum());
	multiply(recip);
    }
    public static void main(String[] args){
	Rational rat1 = new Rational();
	Rational rat2 = new Rational(1,2);
	Rational rat3 = new Rational(5,3);
	System.out.println(rat1 + " = " + rat1.floatValue());
	System.out.println(rat2);
	rat2.multiply(rat3); //5/6
	System.out.println(rat2);
	rat3.divide(rat2); //2 = 30/15
	System.out.println(rat3);
    }
}

