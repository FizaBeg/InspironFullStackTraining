package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Stock extends Remote{
	public int getStockPrice(String cname) throws RemoteException;

}
