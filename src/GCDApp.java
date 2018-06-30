
public class GCDApp {

	public static void main(String[] args) {
		
		
		System.out.println(gcd(18,5));
			
		}

	
	public static int gcd(int d, int r) {
		if (r == 0)
			return d;
		if (r == 1)
			throw new RuntimeException("GCD is 1");
		else return gcd(r, d%r);
		
	}
}
