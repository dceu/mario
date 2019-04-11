# PSET4 TODO

- [x] Refactor Mario to Use Singleton Design Pattern

Our Pyramid factory:
```java
	private PyramidFactory() {};
	private static PyramidFactory pyramidFactory;
	public static PyramidFactory getInstance() {
		if (pyramidFactory == null) {
			pyramidFactory = new PyramidFactory();
		}
		return pyramidFactory;
    }
```
Refactored in our Main:
```java
public static void main(String[] args) {
		PyramidFactory.getInstance();
		PyramidFactory.getInstance().drawPyramid(PyramidFactory.getInstance().makePyramid());
    }
```

- [ ] Set up Spring Environment
Based on the Open/Close Principle:
```
api should be open to extension,
closed for modification
```

- [ ] Replace Singleton pattern with Dependency Injection