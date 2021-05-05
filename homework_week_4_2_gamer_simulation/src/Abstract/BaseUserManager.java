package Abstract;

import java.rmi.RemoteException;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) throws RemoteException, Exception{
		System.out.print("Kayýt yapýldý : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.print("Kullanýcý silindi : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) throws RemoteException, Exception{
		System.out.print("Kullanýcý güncellendi : " + user.getFirstName() + " " + user.getLastName());
		
	}

}
