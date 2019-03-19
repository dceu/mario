import java.util.Scanner;

public class Pyramid {
	private int height;

	public Pyramid() {};

	public Pyramid(int height) {
		this.height = height;
	}
	

	public int getHeight(){
		return height;
	}
	
		
	public  String toString() {
		int h = this.height; // 
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < h; i++) {
			str.append("\n");
			for(int s = h-i-1; s > 0; s--) {
				str.append(" ");
			}
			for(int b = 0; b <= i + 1; b++) {
				str.append("#");
			}
		}
		str.append("\n");
		return str.toString();
	}
	
	
}
