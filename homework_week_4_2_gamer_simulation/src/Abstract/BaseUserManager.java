package Abstract;

import java.rmi.RemoteException;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) throws RemoteException, Exception{
		System.out.print("Kay�t yap�ld� : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.print("Kullan�c� silindi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) throws RemoteException, Exception{
		System.out.print("Kullan�c� g�ncellendi : " + user.getFirstName() + " " + user.getLastName());
		
	}

}
