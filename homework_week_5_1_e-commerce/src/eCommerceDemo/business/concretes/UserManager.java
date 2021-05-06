package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.abstracts.CheckUserInformationService;
import eCommerceDemo.core.abstracts.ConfirmEmailService;
import eCommerceDemo.core.abstracts.ExternalRegistrationService;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService {
	
	UserDao userDao;
	CheckUserInformationService checkUserInformationService;
	ConfirmEmailService confirmEmailService;
	ExternalRegistrationService externalRegistrationService;

	public UserManager(UserDao userDao, CheckUserInformationService checkUserInformationService,
			ConfirmEmailService confirmEmailService, ExternalRegistrationService externalRegistrationService) {
		super();
		this.userDao = userDao;
		this.checkUserInformationService = checkUserInformationService;
		this.confirmEmailService = confirmEmailService;
		this.externalRegistrationService = externalRegistrationService;
	}

	@Override
	public void add(User user) {
		if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && 
				!user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			if(checkUserInformationService.checkFirstName(user.getFirstName()) &&
					checkUserInformationService.checkLastName(user.getLastName()) &&
					checkUserInformationService.checkEmail(user.getEmail()) &&
					checkUserInformationService.checkPassword(user.getPassword())) {
				if(userDao.add(user)) {
					confirmEmailService.confirmEmail(user.getEmail());
				}
			}else {
				System.out.println("Lütfen bilgilerinizi belirtilen kurallara uyarak doldurunuz.");
			}
		}else {
			System.out.println("Lütfen tüm alanlarý doldurunuz.");
		}
	}

	@Override
	public void addWithGoogle(String email) {

		var result = externalRegistrationService.getUser(email);
		//System.out.println("Google hesabýyla kayýt yapýldý.");
		if(userDao.add(result)) {
			confirmEmailService.confirmEmail(result.getEmail());
		}
		
	}

	@Override
	public void login(String email, String password) {
		System.out.println(userDao.login(email,password));
	}

}
