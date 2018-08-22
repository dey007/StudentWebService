package com.arka.student.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;

//@JsonManagedReference and @JsonBackReference are designed to handle this two-way linkage between fields, one for Parent role, the other for Child role, respectively:

@Entity
@Table(name="address2")
public class Address{

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	
	@OneToOne(mappedBy="address",cascade=CascadeType.ALL)
	@JsonBackReference
	private Student student;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
}
