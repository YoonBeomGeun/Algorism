package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class juiceice {
	
	public static int n;
	public static int m;
	public static int[][] arr = new int[1000][1000];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		

	}

}
