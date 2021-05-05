package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception, RemoteException {
		//Mernis client kodlarý
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.valueOf(customer.getNatinalityId()) , customer.getFirstName().toUpperCase(),
										customer.getLastName().toUpperCase(), customer.getYearOfBirth());
	}

}
