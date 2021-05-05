package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseUserManager;
import Abstract.User;
import Abstract.UserCheckService;

public class UserManager extends BaseUserManager {
	
	UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}
	
	@Override
	public void add(User user) throws RemoteException, Exception{
		if(userCheckService.CheckIfRealPerson(user)) {
			super.add(user);
		}else {
			throw new Exception("Kayýt yapýlamadý. Girilen bilgileri kontrol ediniz.");
		}
		
	}
	
	@Override
	public void update(User user) throws RemoteException, Exception{
		if(userCheckService.CheckIfRealPerson(user)) {
			super.update(user);
		}else {
			throw new Exception("Kayýt güncellenemedi. Girilen bilgileri kontrol ediniz.");
		}
		
	}

}
