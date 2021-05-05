package homework_week_3;

public class User {

	private int id;
	private String Email;
	private String address;
	
	public User() {
		
	}

	public User(int id, String email, String address) {
		super();
		this.id = id;
		Email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
