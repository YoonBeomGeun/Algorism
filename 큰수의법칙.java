package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 큰수의법칙 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
        	int min = 10001;
        	
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
				min = Math.min(min, arr[i][j]);
			}
			
			list.add(min);
		}
        
        System.out.println(Collections.max(list));
        
        
		
		
		
	}
}
