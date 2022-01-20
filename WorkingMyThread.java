package com.java.jagadeesh;

public class WorkingMyThread extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running........");
}

	public static void main(String[] args) {
		WorkingMyThread mt = new  WorkingMyThread();
 		 mt.start();

	}

}
