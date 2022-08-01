package com.tnsif.thread;

public class DemoMultiThreads extends Thread {
	public void run() {
		System.out.println("The Id for this class: "+Thread.currentThread().getId());
	}
}
class Eclipse extends Thread {
	public void run() {
		System.out.println("The Id for ECLIPSE class: "+Thread.currentThread().getId());
	}
}
class Chrome extends Thread {
	public void run() {
		System.out.println("The Id for CHROME class: "+Thread.currentThread().getId());
	}
}
class OneNote extends Thread {
	public void run() {
		System.out.println("The Id for ONENOTE class: "+Thread.currentThread().getId());
	}
}


