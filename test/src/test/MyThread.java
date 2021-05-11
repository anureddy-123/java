package test;

public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i =1 ; i<= 10; i++) {
			System.out.println(5+" "+"*"+" "+"="+" "+(5*i));
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException ie){
				System.out.println(ie);
				
			}
		}
		// TODO Auto-generated method stub
		
	}
}
 class Demo{
	
 public static void main(String[] args) {
	 MyThread th = new MyThread();
	 Thread t = new Thread(th);
	 t.start();
	
}

}
