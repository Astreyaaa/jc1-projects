package by.htp.project1.presentation;

public class MassiveView {
	
	public void print(boolean check) {		
		if(check == true){
			System.out.print("Последовательность возрастающая");
		}else if (check == false){
			System.out.print("Последовательность не возрастающая");
		}	
	}
}
