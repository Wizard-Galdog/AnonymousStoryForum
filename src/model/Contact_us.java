package model;

public class Contact_us extends SmartSerializable
{
	private static final long serialVersionUID = 1L;

	private String name;
	private String comment;
	
	public Contact_us(String name, String comment) {
		super();
		this.name = name;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	
}
