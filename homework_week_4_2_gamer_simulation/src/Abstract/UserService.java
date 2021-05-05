package Abstract;

import java.rmi.RemoteException;

public interface UserService {
	void add(User user) throws RemoteException, Exception;
	void delete(User user);
	void update(User user) throws RemoteException, Exception;
}
