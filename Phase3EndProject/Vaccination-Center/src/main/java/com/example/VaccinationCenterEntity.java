package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vaccinationcenter")
public class VaccinationCenterEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long centerid;
	private String centername;
	private String city;
	public long getCenterid() {
		return centerid;
	}
	public void setCenterid(long centerid) {
		this.centerid = centerid;
	}
	public String getCentername() {
		return centername;
	}
	public void setCentername(String centername) {
		this.centername = centername;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "VaccinationCenterEntity [centerid=" + centerid + ", centername=" + centername + ", city=" + city + "]";
	}
	public VaccinationCenterEntity(long centerid, String centername, String city) {
		super();
		this.centerid = centerid;
		this.centername = centername;
		this.city = city;
	}
	
	public VaccinationCenterEntity() {}
}
