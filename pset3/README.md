# PSET3 TODO:
- [x] Refactor so Pyramid class encapsulates the core logic.

```java
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
```


- [x] Ensure that the printer Interface only accepts Pyramids. Use "toString" on the pyramid.
```java
public interface PrintPyramid {
	
		public static void pyraPrint(Pyramid p) {};
	

}
```

- [x] Implement factory Design Pattern to hide the instantiation of the Pyramid Objects.

In main:
```java
public static void main(String[] args) {
		PyramidFactory factory = new PyramidFactory();
		factory.drawPyramid(factory.makePyramid());
    }
```
In factory:
```java
public class PyramidFactory {

	public PyramidFactory() {};


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
```
