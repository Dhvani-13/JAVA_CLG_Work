package clg_work;

public class demo1 {
	private String name,email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "demo1 [name=" + name + ", email=" + email + "]";
	}
	
	
}
