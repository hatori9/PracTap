
public class Users {
	private String userName;
	private String name;
	private int year;

	public Users(String userName, String name, int year) {
		super();
		this.userName = userName;
		this.name = name;
		this.year = year;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
