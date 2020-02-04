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
	
	public void login(int idpls, String psstpsst) {
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			String sql = "SELECT * FROM userwooser WHERE idpls = ? AND psstpsst = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idpls);
			ps.setString(2, psstpsst);
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	@Override
	public OneUserToRuleThemAll insertUser() {

		try(Connection conn = DriverManager.getConnection(url, username, password)){

			// prepared statement guards against SQL injection because it's pre-compiled
			
			String sql = "INSERT INTO userwooser(firstname, lastname) VALUES(?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
		//	ps.setString(1, firstname); // first question mark
		//	ps.setString(2, lastname); // second question mark
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
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
	public OneUserToRuleThemAll updateUser(String psstpsst, int idpls) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			String sql = "UPDATE userwooser SET psstpsst = ? WHERE idpls = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, psstpsst);
			ps.setInt(2, idpls);
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OneUserToRuleThemAll deleteUser(OneUserToRuleThemAll user) {

		return null;
	}

}
