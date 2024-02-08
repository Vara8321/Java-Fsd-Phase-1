package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="citizens")
public class CitizensEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long citizenid;
	
	private String citizenname;
	private String citizencity;
	private int no_of_doses;
	private String vaccination_status;
	private String vaccination_center_name;
	public long getCitizenid() {
		return citizenid;
	}
	public void setCitizenid(long citizenid) {
		this.citizenid = citizenid;
	}
	public String getCitizenname() {
		return citizenname;
	}
	public void setCitizenname(String citizenname) {
		this.citizenname = citizenname;
	}
	public String getCitizencity() {
		return citizencity;
	}
	public void setCitizencity(String citizencity) {
		this.citizencity = citizencity;
	}
	public int getNo_of_doses() {
		return no_of_doses;
	}
	public void setNo_of_doses(int no_of_doses) {
		this.no_of_doses = no_of_doses;
	}
	public String getVaccination_status() {
		return vaccination_status;
	}
	public void setVaccination_status(String vaccination_status) {
		this.vaccination_status = vaccination_status;
	}
	public String getVaccination_center_name() {
		return vaccination_center_name;
	}
	public void setVaccination_center_name(String vaccination_center_name) {
		this.vaccination_center_name = vaccination_center_name;
	}
	@Override
	public String toString() {
		return "CitizensEntity [citizenid=" + citizenid + ", citizenname=" + citizenname + ", citizencity="
				+ citizencity + ", no_of_doses=" + no_of_doses + ", vaccination_status=" + vaccination_status
				+ ", vaccination_center_name=" + vaccination_center_name + "]";
	}
	public CitizensEntity(long citizenid, String citizenname, String citizencity, int no_of_doses,
			String vaccination_status, String vaccination_center_name) {
		super();
		this.citizenid = citizenid;
		this.citizenname = citizenname;
		this.citizencity = citizencity;
		this.no_of_doses = no_of_doses;
		this.vaccination_status = vaccination_status;
		this.vaccination_center_name = vaccination_center_name;
	}
	
	public CitizensEntity() {}
}
