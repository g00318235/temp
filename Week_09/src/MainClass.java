
public class MainClass {
	public static void main(String[] args) {
		MyRunner myRunner = new MyRunner();
		for(int i= 10; i>0 ;i--){
			System.out.println("thread id "+Thread.currentThread().getId());
		
		Thread thread = new Thread(myRunner);

		System.out.println("before thread is called");
		thread.start();

		try{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("after thread is called");
		}
	}

}
