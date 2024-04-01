package Practice;

public class Factorial {

	public static void main(String[] args) {
		int answer = fac(5);
		System.out.println(answer);
	}
	
	public static int fac(int k) {
		if(k<=1) {
			return 1;
		} else {
			return k*fac(k-1);
		}
	}

}
