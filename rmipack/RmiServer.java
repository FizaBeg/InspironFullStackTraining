package rmipack;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer extends UnicastRemoteObject implements Stock{
	
	public RmiServer() throws Exception{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getStockPrice(String cname) throws RemoteException {
		if(cname.equals("wipro")) {
			return 100;
		}
		else {
			return 50;
		}
	}
	
	public static void main(String[] args)throws Exception {
		RmiServer obj=new RmiServer();
		
		LocateRegistry.createRegistry(2000);
		Naming.bind("rmi://localhost:2000/mystockserver", obj);
		System.out.println("server ready...");
	}
}