package by.htp.project2.presentation;

public class Massive2View {
	
	public void print(int[][] massive) {
		
		int m = massive.length;
		int n = massive[0].length;
		
		System.out.println(" ");
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				System.out.print(massive[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
