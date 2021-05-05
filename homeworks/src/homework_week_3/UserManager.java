package homework_week_3;

public class UserManager {
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " + user.getId() + " :)");
	}
	
	public void log(User user) {
		System.out.println("Ýþlem bilgileri loglandý. Ortak konfigürasyon.");
	}
}
