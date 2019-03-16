import java.util.Scanner;

public class MarioPset2 {
	
	
	public static Pyramid prompt() {
		int h;
		Pyramid p = new Pyramid();
		do {
			System.out.println("Give me an integer from 0 to 23: ");
			Scanner input = new Scanner(System.in);
			p.setHeight(input.nextInt());
			h = p.getHeight();
		} while ( h < 0 || h > 23);
		return p;
	}
	
	public static  void drawPyramid(Pyramid p) {
		int c;
		do	{
			System.out.println("Type \'1\' to print to file, \'2\' to print to console: ");
			Scanner input = new Scanner(System.in);
			c = input.nextInt();
			if (c == 1) {ToFilePrintPyramid.pyraPrint(p); break;}
			if (c == 2) {ToConsolePrintPyramid.pyraPrint(p); break;}
		}	while (c != 2 || c!=1);
	}
	
	public static void main(String[] args) {
		drawPyramid(prompt());
	}

}
