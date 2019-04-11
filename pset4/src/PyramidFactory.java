import java.util.Scanner;


public class PyramidFactory {

	private PyramidFactory() {};
	private static PyramidFactory pyramidFactory;
	public static PyramidFactory getInstance() {
		if (pyramidFactory == null) {
			pyramidFactory = new PyramidFactory();
		}
		return pyramidFactory;
	}


	public Pyramid makePyramid() {
		int h;
		do {
			System.out.println("Give me an integer from 0 to 23: ");
			Scanner input = new Scanner(System.in);
			h = input.nextInt();
		} while ( h < 0 || h > 23);
		return new Pyramid(h);

	}
	public void drawPyramid(Pyramid p) {
		int c;
		do	{
			System.out.println("Type \'1\' to print to file, \'2\' to print to console: ");
			Scanner input = new Scanner(System.in);
			c = input.nextInt();
			if (c == 1) {
				ToFilePrintPyramid fprint = new ToFilePrintPyramid();
				fprint.pyraPrint(p); break;}
			if (c == 2) {
				ToConsolePrintPyramid cprint = new ToConsolePrintPyramid();
				cprint.pyraPrint(p); break;}
		}	while (c != 2 || c!=1);
	}

}
