
class Mario {
public static void main(String[] args) {
	PyramidHeight.prompt();
	int height = PyramidHeight.scanHeight();
	while (PyramidHeight.validateHeight(height) == false){
		PyramidHeight.enforce();
		PyramidHeight.prompt();
		height = PyramidHeight.scanHeight();
	}
	System.out.println("Your pyramid height is: " + height);	
}
}
