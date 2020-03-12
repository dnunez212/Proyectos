package com.pe.apps.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="employee", schema = "devsoa")
public class Employee implements Serializable{
	// se coloca serializable para que tenga un alto performance en un entorno de redes.
	@Id
	@Column(name="emp_id")
	@GeneratedValue (strategy = GenerationType.AUTO, generator = "sequence")
	@SequenceGenerator (name="sequence",sequenceName = "emp_seq")
	private long empid;
	
	@Column(name="emp_name")
	private String empname;
	
	@Column(name="emp_empalias")
	private String empalias;
	
	@Column(name="emp_emppassword")
	private String emppassword;
	
	@Column(name="emp_empdni")
	private String empdni;
	
	@Column(name="emp_ampmail")
	private String empmail;
	
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpalias() {
		return empalias;
	}
	public void setEmpalias(String empalias) {
		this.empalias = empalias;
	}
	public String getEmppassword() {
		return emppassword;
	}
	public void setEmppassword(String emppassword) {
		this.emppassword = emppassword;
	}
	public String getEmpdni() {
		return empdni;
	}
	public void setEmpdni(String empdni) {
		this.empdni = empdni;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
		
	
}
