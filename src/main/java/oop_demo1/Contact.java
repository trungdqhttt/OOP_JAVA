package oop_demo1;

public class Contact {
	private Long id;
	private String name;
	private String phone;
	
	public Contact() {};
	
	public Contact(Long id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
	}
}
