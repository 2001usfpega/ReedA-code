package com.projects.bank;

public class OneUserToRuleThemAll {
	
	public int idpls;
	public String firstname;
	public String lastnmame;
	public String psstpsst;
	public int checkpls;
	public int savesave;
	public boolean dadmin;
	
	public OneUserToRuleThemAll() {

	}
	
	public OneUserToRuleThemAll(int idpls, String firstname, String lastnmame, String psstpsst, int checkpls,
			int savesave, boolean dadmin) {
		super();
		this.idpls = idpls;
		this.firstname = firstname;
		this.lastnmame = lastnmame;
		this.psstpsst = psstpsst;
		this.checkpls = checkpls;
		this.savesave = savesave;
		this.dadmin = dadmin;
	}

	@Override
	public String toString() {
		return "OneUserToRuleThemAll [idpls=" + idpls + ", firstname=" + firstname + ", lastnmame=" + lastnmame
				+ ", psstpsst=" + psstpsst + ", checkpls=" + checkpls + ", savesave=" + savesave + ", dadmin=" + dadmin
				+ "]";
	}

	public int getIdpls() {
		return idpls;
	}

	public void setIdpls(int idpls) {
		this.idpls = idpls;
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

	public int getCheckpls() {
		return checkpls;
	}

	public void setCheckpls(int checkpls) {
		this.checkpls = checkpls;
	}

	public int getSavesave() {
		return savesave;
	}

	public void setSavesave(int savesave) {
		this.savesave = savesave;
	}

	public boolean isDadmin() {
		return dadmin;
	}

	public void setDadmin(boolean dadmin) {
		this.dadmin = dadmin;
	}
	
}
	