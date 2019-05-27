package com.bb.generics;

class Singing2 implements Runnable {

	public void run() {

		System.out.println("Singing");

	}

}

public class SingAndDance2 {

	public static void main(String[] args) {

		Singing2 singing2 = new Singing2();

		Thread singingTask = new Thread(singing2);

		singingTask.start();
		singingTask.start();


		System.out.println("Dancing");

	}

}
