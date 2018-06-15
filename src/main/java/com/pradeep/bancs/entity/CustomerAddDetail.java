package com.pradeep.bancs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="cusvdd")
public class CustomerAddDetail {
@Id
@GeneratedValue(generator = "gen")
@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="customer"))
int cif_no;
String risk_grad;
Float income;
String lastName;
String profession;
@OneToOne
@JoinColumn(name = "cif_no",nullable=false)
private Customer customer;
@Override
public String toString() {
	return "CustomerAddDetail [cif_no=" + cif_no + ", risk_grad=" + risk_grad
			+ ", income=" + income + ", profession=" + profession
			+ ", customer=" + customer + "]";
}
public int getCif_no() {
	return cif_no;
}
public void setCif_no(int cif_no) {
	this.cif_no = cif_no;
}
public String getRisk_grad() {
	return risk_grad;
}
public void setRisk_grad(String risk_grad) {
	this.risk_grad = risk_grad;
}
public Float getIncome() {
	return income;
}
public void setIncome(Float income) {
	this.income = income;
}
public String getProfession() {
	return profession;
}
public void setProfession(String profession) {
	this.profession = profession;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
}
