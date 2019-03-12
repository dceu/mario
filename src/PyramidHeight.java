import java.util.Scanner;

class PyramidHeight {
	public static void prompt() {
		System.out.println("Enter your pyramid height: ");
	}
	public static int scanHeight() {
		Scanner input = new Scanner(System.in);
		int height = input.nextInt();
		return height;
	}
	public static boolean validateHeight(int n) {
		if (n >=0 && n <= 23)
			return true;
		else return false;
	}
	public static void enforce() {
		System.out.println("Valid height is [0,23]");
	}	
}
