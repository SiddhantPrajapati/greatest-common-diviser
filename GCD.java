import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GCD ab = new GCD();
		System.out.println("Enter the Number of parameter:");
		//int no = sc.nextInt();
		int val1, val2;
	/*	for(int i = 0 ; i < no ; i++ ) {
			System.out.println("Enter Number:");
			
		}
		*/
		val1 = sc.nextInt();
		val2 = sc.nextInt();
		int a = ab.getGcd(val1, val2);
		System.out.println("GCD of " + val1 + " & " + val2 + " _ is " + a );
	}
	
	int getGcd(int val1, int val2) {
		int factor1 = 1, factor2 = 1, rem1, rem2, divisor = 1;
		for(int i = 1 ; i <= Math.min(val1, val2) ; i++) {
			rem1 = val1 % i;
			if(rem1 == 0) {
				factor1 = i;
			}
			rem2 = val2 % i;
			if(rem2 == 0) {
				factor2 = i;
			}
			if(factor1 == factor2) {
				divisor = factor1;
			}	
	}
	return divisor;
	}
}
		
		