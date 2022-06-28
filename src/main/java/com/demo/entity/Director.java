package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Director {
	@Id
    @Column(name="directorid")
	@GeneratedValue(strategy=GenerationType.AUTO)   //Auto increment 
	private int directorId;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	private String address;
	@Column(name="contactnumber")
	private int contactNumber;
	@Column(name="emailid")
	private String emailId;
	@ManyToMany(cascade= CascadeType.ALL)
	@JoinTable(name="movie_director",joinColumns=@JoinColumn(name="movie_Id",referencedColumnName="movieid"),
	inverseJoinColumns=@JoinColumn(name="Director_Id",referencedColumnName="directorid"))
	public int getDirectorId() {
		return directorId;
	}
	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String toString() {
		return "Director [DirectorId=" + directorId + ",Address=" + address + ",   ContactNumber=" + contactNumber  + ",EmailId="+ emailId+
				",FirstName="+ firstName+",LastName="+lastName+"]";
	}
	
	 
	

}
