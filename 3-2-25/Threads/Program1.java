package Threads;

public class Program1 extends Thread {
	

	
		  @Override
		  public void run() {
		    System.out.println("Hello, World!");
		  }

		  public static void main(String[] args) {
		    Program1 thread = new Program1();
		    thread.start();
		  }
		}

