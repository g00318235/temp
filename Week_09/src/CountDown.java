
public class CountDown {

	public static void main(String[] args) {
		for(int i= 10; i>0 ;i--){
			System.out.println("thread id "+Thread.currentThread().getId());
			System.out.println("i is "+i);
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Blast Off");
	}
}
