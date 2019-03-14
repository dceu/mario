
class Mario {
	public static void prompt() {
		PyramidHeight.prompt();
	}

	public static int validateLoop() {
		PyramidHeight.scanHeight();
			int height;
			while (PyramidHeight.validateHeight(height) == false){
			PyramidHeight.enforce();
			PyramidHeight.prompt();
			 height = PyramidHeight.scanHeight();
			}
			return height;

	}
	
	public static void drawPyramid(int h){
		int height = h;
		int length = h;

	}
	
public static void main(String[] args) {
	prompt();
	int height = validateLoop();
	System.out.println("Your pyramid height is: " + height);	
	drawPyramid(height);
	}
}
