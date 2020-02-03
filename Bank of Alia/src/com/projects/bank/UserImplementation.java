package com.projects.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.projects.bank.OneUserToRuleThemAll;

public class UserImplementation implements UserInterface {

	private static String url = System.getenv("url");
	private static String username = System.getenv("username");
	private static String password = System.getenv("password");
	
	
	public static void main(String[] args) {

	}
	
	@Override
	public int insertUser() {

		return 0;
	}

	@Override
	public List<OneUserToRuleThemAll> selectAllUsers() {

		List<OneUserToRuleThemAll> user = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){

			String sql = "SELECT * FROM userwooser";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				user.add(
						new OneUserToRuleThemAll()
				);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public OneUserToRuleThemAll selectUserByName(String firstname, String lastname) {

		try(Connection conn = DriverManager.getConnection(url, username, password)){

			// prepared statement guards against SQL injection because it's pre-compiled
			
			//String sql = "INSERT INTO userwooser(firstname, lastname) VALUES(?, ?)";
			
			String sql = "SELECT * FROM userwooser WHERE firstname = ? AND lastname = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, firstname); // first question mark
			ps.setString(2, lastname); // second question mark
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateUser(OneUserToRuleThemAll user) {

		return 0;
	}

	@Override
	public int deleteUser(OneUserToRuleThemAll user) {

		return 0;
	}

}
