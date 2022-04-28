package com.example.demo.POJO;


public class ResponsePOJO {

	private boolean is_success;
	private String user_id;
	private String email_id;
	private String roll_number;
	private String[] numbers;
	private String[] alphabate;
	
	
   public ResponsePOJO(boolean status, String user_id, String email_id, String college_roll_number, String[] numbers,
			String[] alphabate) {
	   this.is_success = status;
		this.user_id = user_id;
		this.email_id = email_id;
		this.roll_number = college_roll_number;
		this.numbers = numbers;
		this.alphabate = alphabate;
	}


	public ResponsePOJO() {
	  
	}
	
	
	public boolean is_success() {
		return is_success;
	}
	public void setIs_success(boolean status) {
		this.is_success = status;
	}
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String get_Roll_number() {
		return roll_number;
	}
	public void setRoll_number(String college_roll_number) {
		this.roll_number = college_roll_number;
	}


	public String[] getNumbers() {
		return numbers;
	}


	public void setNumbers(String[] numbers) {
		this.numbers = numbers;
	}


	public String[] getAlphabate() {
		return alphabate;
	}


	public void setAlphabate(String[] alphabate) {
		this.alphabate = alphabate;
	}


}
