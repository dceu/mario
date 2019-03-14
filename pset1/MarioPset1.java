import java.util.Scanner;
public class MarioPset1 {
	
	public static void prompt() {
		System.out.println("Give me a number from 0 to 23: ");
	}
	
	public static int getPyramidHeight() {
			Scanner input = new Scanner(System.in);
			int height = input.nextInt();
			return height;
		}
	
	public static boolean isNotValid (int h) {
		while (h < 0 || h > 23) {
			return true;}
		 return false;
		}


	public static void drawPyramid(int h) {
		for(int i = 0; i < h; i++) {
			System.out.println();
			for(int s = h-i-1; s > 0; s--) {
				System.out.print(" ");
			}
			for(int b = 0; b <= i + 1; b++) {
				System.out.print("#");
			}
		}
	}
	public static void main(String[] args) {
		int height;
		do {
		prompt();
		height = getPyramidHeight();
		}
		while (isNotValid(height));
		drawPyramid(height);
	}

}
