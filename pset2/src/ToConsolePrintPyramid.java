
public class ToConsolePrintPyramid implements PrintPyramid {

	
	public static void pyraPrint(Pyramid p) {
		int h = p.getHeight(); // accessing the pyramid height with this getter method
		for(int i = 0; i < h; i++) {
			System.out.println();
			for(int s = h-i-1; s > 0; s--) {
				System.out.print(" ");
			}
			for(int b = 0; b <= i + 1; b++) {
				System.out.print("#");
			}
		}
		System.out.println();
	}
}
