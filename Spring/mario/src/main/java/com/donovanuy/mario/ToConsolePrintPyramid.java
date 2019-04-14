package com.donovanuy.mario;

public class ToConsolePrintPyramid implements PrintPyramid {

	public ToConsolePrintPyramid() {}
	
	public void pyraPrint(Pyramid p) {
		System.out.println(p.toString());
	}
}
