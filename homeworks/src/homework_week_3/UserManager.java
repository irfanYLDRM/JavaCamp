package homework_week_3;

public class UserManager {
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: " + user.getId() + " :)");
	}
	
	public void log(User user) {
		System.out.println("��lem bilgileri logland�. Ortak konfig�rasyon.");
	}
}
