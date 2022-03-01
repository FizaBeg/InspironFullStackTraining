package classAlma;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class LambdaDemo2 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("one child thread executed...");
			}
		});
		Runnable r=()->{System.out.println("child thread another executed...");};
		es.execute(r);
		//or
		es.execute(()->{System.out.println("child thread another executed...");});
		
		
		Seller seller=new SellerImpl();
		seller.sell();
		
		seller=new Seller() {
			@Override
			public void sell() {
				System.out.println("sell implementation is written here directly..");
			}
		};
		seller.sell();
		
		Seller seller2=()->{
			//the logic of the sell method is written here...
			System.out.println("sell method implementation logic is written here...");
		};
		
		seller2.sell();
	}
}
class SellerImpl implements Seller{
	@Override
		public void sell() {
			System.out.println("sell method called..");
		}
}
interface Seller{
	public void sell();
	//public void selllll();
}