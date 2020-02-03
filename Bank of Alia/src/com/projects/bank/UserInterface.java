package com.projects.bank;

import java.util.List;

public interface UserInterface {

	//CREATE
	public int insertUser();
	
	//READ
	public List<OneUserToRuleThemAll> selectAllUsers();
	
	public OneUserToRuleThemAll selectUserByName(String firstname, String lastname);

	//UPDATE
	public int updateUser(OneUserToRuleThemAll user);
	
	//DELETE
	public int deleteUser(OneUserToRuleThemAll user);
	
}
