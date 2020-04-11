package com.class32_repl;

public class Person {
	private  String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	
	public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getBirthmonth() {
		return birthmonth;
	}

	public int getBirthday() {
		return birthday;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public String getSsn() {
		return ssn;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String formatBirthday() {
		return this.birthmonth + "/" + this.birthday + "/" + this.birthyear;
	}
	
}


