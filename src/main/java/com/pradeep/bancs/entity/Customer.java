package com.pradeep.bancs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cusm")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cif_no")
	private int cif_no;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mother_name")
	private String mother_name;
	
	@Column(name = "minor")
	private Boolean minor;
	
	@Column(name = "gaurd_cif")
	private int gaurdian_cif;
	
//	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
//	private CustomerAddDetail cust_add_detail;

	public int getCif_no() {
		return cif_no;
	}

	public void setCif_no(int cif_no) {
		this.cif_no = cif_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public Boolean getMinor() {
		return minor;
	}

	public void setMinor(Boolean minor) {
		this.minor = minor;
	}

	public int getGajurdian_cif() {
		return gaurdian_cif;
	}

	public void setGajurdian_cif(int gajurdian_cif) {
		this.gaurdian_cif = gajurdian_cif;
	}

	@Override
	public String toString() {
		return "Customer [cif_no=" + cif_no + ", name=" + name
				+ ", mother_name=" + mother_name + ", minor=" + minor
				+ ", gaurdian_cif=" + gaurdian_cif  + "]";
	}

	public int getGaurdian_cif() {
		return gaurdian_cif;
	}

	public void setGaurdian_cif(int gaurdian_cif) {
		this.gaurdian_cif = gaurdian_cif;
	}

	// public CustomerAddDetail getCust_add_detail() {
	// return cust_add_detail;
	// }
	//
	// public void setCust_add_detail(CustomerAddDetail cust_add_detail) {
	// this.cust_add_detail = cust_add_detail;
	// }

}
