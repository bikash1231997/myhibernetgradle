package com.MyHibernateGradle.First;

import java.time.LocalDateTime;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
//@Entity(name="Student_Details")
//@Table(name="student_datails")
public class studentFirst {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int id;

	@Column(name = "strudent_name", nullable = false)
	private String name;

	@Column(name = "student_address")
	private String city;

	@Column(name = "student_aadhar", length = 12)
	private String aadhar;

	@Column(name = "student_class")
	private String sclass;

	@Column(name = "student_school")
	private String school;

	@Column(name = "student_joinDate")
	//@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime date;

	@Column(name = "student_photo")
	@Lob
	private byte[] photo;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}



	public studentFirst() {
		super();
		// TODO Auto-generated constructor stub
	}

	public studentFirst(int id, String name, String city, String aadhar, String sclass, String school,
			LocalDateTime date, byte[] photo) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.aadhar = aadhar;
		this.sclass = sclass;
		this.school = school;
		this.date = date;
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", city=" + city + ", aadhar=" + aadhar + ", sclass=" + sclass
				+ ", school=" + school + ", date=" + date + ", photo=" + Arrays.toString(photo) + "]";
	}

}
