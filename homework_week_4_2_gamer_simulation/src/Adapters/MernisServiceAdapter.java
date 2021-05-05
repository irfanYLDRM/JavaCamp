package Adapters;

import java.rmi.RemoteException;

import Abstract.User;
import Abstract.UserCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) throws Exception, RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.valueOf(user.getNationalId()) , user.getFirstName().toUpperCase(),
										user.getLastName().toUpperCase(), user.getYearOfBirth());
	}

}
