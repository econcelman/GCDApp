import java.util.Scanner;
public class GCDApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d, r;
		
		System.out.println("Please enter the first number: ");
		d = scan.nextInt();
		System.out.println();
		
		System.out.println("Please enter the second number: ");
		r = scan.nextInt();
		System.out.println();
		
		
		System.out.println("Greatest common denominator between " + d + " and " + r + " is " + gcd(d,r));
			
		}

	
	public static int gcd(int d, int r) {
		if (r == 0)
			return d;
		if (r == 1)
			throw new RuntimeException("GCD is 1");
		else return gcd(r, d%r);
		
	}
}
