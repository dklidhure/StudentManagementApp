package com.Student.Manage;



public class Student {

	private int id;
	private String name;
	private String phone;
	private String city;
	
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Student(java.lang.String name, java.lang.String phone, java.lang.String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
