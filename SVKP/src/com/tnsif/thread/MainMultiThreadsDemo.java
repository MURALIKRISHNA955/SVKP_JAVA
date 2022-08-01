package com.tnsif.thread;

public class MainMultiThreadsDemo {

	public static void main(String[] args) {
		DemoMultiThreads obj = new DemoMultiThreads();
		Thread tobj = new Thread(obj);
		tobj.start();
		
		Eclipse obj1 = new Eclipse();
		Thread tobj1 = new Thread(obj1);
		tobj1.start();
		
		Chrome obj2 = new Chrome();
		Thread tobj2 = new Thread(obj2);
		tobj2.start();
		
		OneNote obj3 = new OneNote();
		Thread tobj3 = new Thread(obj3);
		tobj3.start();
		
	}

}
