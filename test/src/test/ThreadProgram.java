package test;

public class ThreadProgram extends Thread{
	public static void main(String[] args) {
		
		ThreadProgram tp = new ThreadProgram();
		tp.start();//start the thread
		
		
	}
	public void run() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(5+" "+"*"+" "+i+" "+"="+" "+(5*i));
			try {
			Thread.sleep(10000);
		}
			catch(InterruptedException ie) {
				System.out.println(ie.getMessage());
			}
	}

}
}
