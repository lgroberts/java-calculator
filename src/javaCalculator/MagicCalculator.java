package javaCalculator;

public class MagicCalculator extends JavaCalculator {

	public Double squareRoot(int x, int y) {
		return Math.sqrt(x);
	}
	public Double sine(int x, int y) {
		return Math.sin(x);
	}
	public Double cosine(int x, int y) {
		return Math.cos(x);
	}
	public Double tangent(int x, int y) {
		return Math.tan(x);
	}
	public Double factorial(int x, int y) {
		double factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
