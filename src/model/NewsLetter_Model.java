package model;

public class NewsLetter_Model extends SmartSerializable
{
	private static final long serialVersionUID = 1L;

	private String email;
	
	public NewsLetter_Model(String email) {
		this.setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
