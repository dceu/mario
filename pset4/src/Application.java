import java.util.* ;

public class Application {
	

	
	
	
	public static void main(String[] args) {
		PyramidFactory.getInstance();
		PyramidFactory.getInstance().drawPyramid(PyramidFactory.getInstance().makePyramid());
	}

}
