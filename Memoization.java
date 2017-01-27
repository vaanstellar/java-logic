import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/*
 * Description : Basic Template for memoization example
 * Memoization : Save (memoize) a computed answer for possible later reuse, rather than recomputing the answer.
 */

public class Memoization {
	Map<Integer, BigInteger> memo = new HashMap<>();

	public static void main(String[] args) {
		Memoization memoization = new Memoization();
		System.out.println("fibonacci : " + memoization.getFibonacci(666));
	}

	private BigInteger getFibonacci(int n) {

		BigInteger value = BigInteger.ZERO;
		if (n == 0) {
			return BigInteger.ZERO;
		} else if (n == 1) {
			return BigInteger.ONE;
		} else if (memo.get(n) != null) {
			return memo.get(n);
		} else {
			value = getFibonacci(n - 1).add(getFibonacci(n - 2));
			memo.put(n, value);
			return value;
		}

	}

}
