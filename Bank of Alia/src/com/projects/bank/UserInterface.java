package com.projects.bank;

import java.util.List;

public interface UserInterface {

	//CREATE
	public OneUserToRuleThemAll insertUser();
	
	//READ
	public List<OneUserToRuleThemAll> selectAllUsers();
	
	public OneUserToRuleThemAll selectUserByName(String firstname, String lastname);

	//UPDATE
	public OneUserToRuleThemAll updateUser(String psstpsst, int idpls);
	
	//DELETE
	public OneUserToRuleThemAll deleteUser(OneUserToRuleThemAll user);
	
}
