
public class MyRunner implements Runnable{
	public void run(){
		System.out.println("start thread id "+Thread.currentThread().getId());
		try{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end thread id "+Thread.currentThread().getId());
	}
}
