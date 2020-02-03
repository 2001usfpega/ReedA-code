package com.projects.bank;

public class OneUserToRuleThemAll {
	
	public int identificationpls;
	public String firstname;
	public String lastnmame;
	public String psstpsst;
	public String firstname2;
	public String lastname2;
	public String psstpsst2;
	
	public OneUserToRuleThemAll() {

	}
	
	public OneUserToRuleThemAll(int identificationpls, String firstname, String lastnmame, String psstpsst,
			String firstname2, String lastname2, String psstpsst2) {
		super();
		this.identificationpls = identificationpls;
		this.firstname = firstname;
		this.lastnmame = lastnmame;
		this.psstpsst = psstpsst;
		this.firstname2 = firstname2;
		this.lastname2 = lastname2;
		this.psstpsst2 = psstpsst2;
	}
	
	@Override
	public String toString() {
		return "OneUserToRuleThemAll [identificationpls=" + identificationpls + ", firstname=" + firstname
				+ ", lastnmame=" + lastnmame + ", psstpsst=" + psstpsst + ", firstname2=" + firstname2 + ", lastname2="
				+ lastname2 + ", psstpsst2=" + psstpsst2 + "]";
		
	}
	
	public int getIdentificationpls() {
		return identificationpls;
	}
	
	public void setIdentificationpls(int identificationpls) {
		this.identificationpls = identificationpls;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastnmame() {
		return lastnmame;
	}
	
	public void setLastnmame(String lastnmame) {
		this.lastnmame = lastnmame;
	}
	
	public String getPsstpsst() {
		return psstpsst;
	}
	
	public void setPsstpsst(String psstpsst) {
		this.psstpsst = psstpsst;
	}
	
	public String getFirstname2() {
		return firstname2;
	}
	
	public void setFirstname2(String firstname2) {
		this.firstname2 = firstname2;
	}
	
	public String getLastname2() {
		return lastname2;
	}
	
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	
	public String getPsstpsst2() {
		return psstpsst2;
	}
	
	public void setPsstpsst2(String psstpsst2) {
		this.psstpsst2 = psstpsst2;
	}
	
}
