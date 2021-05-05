package Abstract;

import java.rmi.RemoteException;

public interface UserCheckService {
	boolean CheckIfRealPerson(User user) throws Exception, RemoteException;
}
