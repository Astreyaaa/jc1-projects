package by.htp.project2.logic;

import java.util.Scanner;

public class Massive2Logic {

	public int[][] fill(int[][] massive) {
		
		int m = massive.length;
		int n = massive[0].length;
		int x;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("¬веди число от 1 до 9: ");
		for(int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				while (!sc.hasNextInt()) {
					sc.nextLine();
					System.out.println("¬веди инт: ");
				}
				x = sc.nextInt();
				massive[i][j] = x;
			}
		}
		
		return massive;
	}
}
