package com.bb.generics;

class Singing extends Thread {
	public void run() {
		System.out.println("Singing");
	}

//	public void start() {
//		System.out.println("Start method");
//	}
}

public class SingAndDance {

	public static void main(String[] args) {

		Thread singingTask = new Singing(); // Thread instance
		Thread singingTask1 = new Singing(); // Thread instance

		Thread singingTask2 = new Singing(); // Thread instance


		singingTask.run(); // Thread of execution

		System.out.println("Dancing");

	}
}
