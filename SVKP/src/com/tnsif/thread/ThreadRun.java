package com.tnsif.thread;

public class ThreadRun implements Runnable {

	@Override
	public void run() {
		System.out.println("Thtread id Runnning");
	}

	public static void main(String[] args) {
		ThreadRun obj =  new ThreadRun();
		Thread tobj = new Thread(obj);
		tobj.start();
	}

}
