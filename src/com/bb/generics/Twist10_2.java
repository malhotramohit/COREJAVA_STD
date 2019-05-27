package com.bb.generics;

class Sing extends Thread {

	public void run() {
		System.out.println("Singing");
		throw new RuntimeException("Run");
	}
}

public class Twist10_2 {
	public static void main(String[] args) {
		Thread sing = new Sing();
		sing.start();
		throw new RuntimeException("Main");
	}
}
