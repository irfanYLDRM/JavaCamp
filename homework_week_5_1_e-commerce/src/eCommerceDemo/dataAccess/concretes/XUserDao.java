package eCommerceDemo.dataAccess.concretes;

import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class XUserDao implements UserDao {

	@Override
	public boolean add(User user) {
		if(getEmail(user.getEmail())) {
			System.out.println("X veritabanýna kayýt yapýldý: " + user.getFirstName() + " " + user.getLastName());
			return true;
		}else {
			System.out.println("Girilen e-posta ile kullanýcý mevcut farklý bir e-posta deneyiniz.");
			return false;
		}
	}

	@Override
	public void delete(User user) {
		System.out.println("X veritabanýndan kayýt silindi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("X veritabanýndaki kayýt güncellendi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getEmail(String email) {
		if("irfan@yildirim.com.tr"==email) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String login(String email, String password) {
		//Kullanýcý getirildi.
		User user = new User();
		user.setEmail("irfan@yildirim.com.tr");
		user.setPassword("123456");
		if(user.getEmail()==email && user.getPassword()==password) {
			return "Giriþ yapýldý. Hoþgeldiniz: " + user.getFirstName() + " " + user.getLastName();
		}else {
			return "Girilen bilgiler hatalý lütfen tekrar deneyiniz.";
		}
	}

}
