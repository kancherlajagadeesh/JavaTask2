package com.java.jagadeesh;

public class WorkingWithMyRunnableThread  implements Runnable{
	 public static int myCount = 0;
	    public WorkingWithMyRunnableThread(){
	         
	    }
	    public void run() {
	        while(WorkingWithMyRunnableThread.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++WorkingWithMyRunnableThread.myCount));
	                Thread.sleep(200);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 

	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
        WorkingWithMyRunnableThread mrt = new WorkingWithMyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(WorkingWithMyRunnableThread.myCount <= 15){
            try{
                System.out.println("Main Thread: "+(++WorkingWithMyRunnableThread.myCount));
                Thread.sleep(200);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
		

	}

}
