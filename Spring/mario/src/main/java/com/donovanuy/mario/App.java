package com.donovanuy.mario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
	}

	private PyramidFactory pyramidFactory;
	public App (PyramidFactory pyramidFactory){
		this.pyramidFactory = pyramidFactory;
	}
	public void start(){
	pyramidFactory.drawPyramid(pyramidFactory.makePyramid());

	}
	
}
