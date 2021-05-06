package eCommerceDemo.core.adapters;

import eCommerceDemo.JConfirmEmail.JConfirmEmail;
import eCommerceDemo.core.abstracts.ConfirmEmailService;

public class ConfirmEmailAdapter implements ConfirmEmailService {

	@Override
	public boolean confirmEmail(String email) {
		
		JConfirmEmail jConfirmEmail = new JConfirmEmail();
		if(jConfirmEmail.confirmEmail(email)) {
			System.out.println("Email onayý yapýldý.");
			return true;
		}else {
			System.out.println("Email onayýnýz yapýlamadý.");
			return false;
		}
	}

}
