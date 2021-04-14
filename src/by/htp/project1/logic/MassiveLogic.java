package by.htp.project1.logic;


public class MassiveLogic {

	public boolean check(int[] massive) {
		int n = massive.length;
		int masCheck = massive[0];
		boolean check = true;
		
		for(int i = 0; i<n; i++) {
			if(massive[i] >= masCheck) {
				check = true;
				masCheck = massive[i];
			}else {
				check = false;
				return check;
			}	
		}
		return check;
	}
}
