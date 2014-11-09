import java.math.BigInteger;
import java.util.Scanner;


public class ProbG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProbG g = new ProbG();
		g.solve();
	}

	private void solve() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		for(int i = 1; i <= c; i++) {
			int n = s.nextInt();
			int k = s.nextInt();
			BigInteger r1 = fact(n, n-k);
			BigInteger r2 = fact(k, 1);
			BigInteger r3 = r1.divide(r2);
			System.out.println("Case " + i + ": " + r3);
		}
		s.close();
	}
	
	
	private BigInteger fact (int n, int k) {
		BigInteger r = new BigInteger("1");
		while (n > k) {
			r = r.multiply(new BigInteger(n-- + ""));
		}
		return r;
	}

}
