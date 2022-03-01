package rmipack;

import java.rmi.Naming;

public class RmiClient {
	public static void main(String[] args) throws Exception {
		Stock stock =(Stock)Naming.lookup("rmi://localhost:2000/mystockserver");
				
		System.out.println(stock.getStockPrice("wipro"));
		
	}

}
