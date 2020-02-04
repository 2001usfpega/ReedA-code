package com.projects.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.projects.bank.OneUserToRuleThemAll;

public class UserImplementation {

	private static String url = System.getenv("url");
	private static String username = System.getenv("username");
	private static String password = System.getenv("password");

	public void viewAccount(int idpls, String psstpsst) {

		List<OneUserToRuleThemAll> user = new ArrayList<>();

		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			String sql = "SELECT * FROM userwooser WHERE idpls = ? AND psstpsst = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idpls);
			ps.setString(2, psstpsst);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {

				user.add(
						new OneUserToRuleThemAll(
								rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getInt(5),
								rs.getInt(6),
								rs.getBoolean(7))
				);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	public OneUserToRuleThemAll login(int idpls, String psstpsst) {

		OneUserToRuleThemAll user = null;

		try(Connection conn = DriverManager.getConnection(url, username, password)){

			String sql = "SELECT * FROM userwooser WHERE idpls = ? AND psstpsst = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idpls);
			ps.setString(2, psstpsst);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
			user = new OneUserToRuleThemAll(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getBoolean(7)
				);
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public OneUserToRuleThemAll insertUser(String firstname, String lastname, String psstpsst) {

		try(Connection conn = DriverManager.getConnection(url, username, password)){

			String sql = "INSERT INTO userwooser(firstname, lastname, psstpsst) VALUES(?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, psstpsst);
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<OneUserToRuleThemAll> selectAllUsers() {

		List<OneUserToRuleThemAll> user = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){

			String sql = "SELECT * FROM userwooser";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				user.add(
						new OneUserToRuleThemAll(
								rs.getInt(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getInt(5),
								rs.getInt(6),
								rs.getBoolean(7))
				);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public OneUserToRuleThemAll selectUserByID(int idpls) {

		OneUserToRuleThemAll user = new OneUserToRuleThemAll();

		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			String sql = "SELECT * FROM userwooser WHERE idpls = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idpls);

			ResultSet rs = ps.executeQuery();
			rs.next();

			user.setIdpls(rs.getInt(1));
			user.setFirstname(rs.getString(2));
			user.setLastnmame(rs.getString(3));
			user.setPsstpsst(rs.getString(4));
			user.setCheckpls(rs.getInt(5));
			user.setSavesave(rs.getInt(6));
			user.setDadmin(rs.getBoolean(7));

		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println(user);
		return user;
	}

	public OneUserToRuleThemAll updateUserPassword(String psstpsst, int idpls) {

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

	public OneUserToRuleThemAll updateUserChecking(int checkpls, int idpls){

		try(Connection conn = DriverManager.getConnection(url, username, password)){

			String sql = "UPDATE userwooser SET checkpls = ? WHERE idpls = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, checkpls);
			ps.setInt(2, idpls);

			ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public OneUserToRuleThemAll updateUserSavings(int savesave, int idpls){

		try(Connection conn = DriverManager.getConnection(url, username, password)){

			String sql = "UPDATE userwooser SET save = ? WHERE idpls = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, savesave);
			ps.setInt(2, idpls);

			ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public OneUserToRuleThemAll deleteUser(int idpls) {

		try(Connection conn = DriverManager.getConnection(url, username, password)) {

			String sql = "SELECT checkpls, savesave FROM userwooser WHERE idpls = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idpls);
			ResultSet rs = ps.executeQuery();

			if (rs.next() && rs.getInt(1) == 0 &&
					rs.getInt(2) == 0) {
				sql = "DELETE FROM userwooser WHERE idpls = ?";

				ps = conn.prepareStatement(sql);
				ps.setInt(1, idpls);

				ps.executeUpdate();
			}else{
				System.out.println("This account is not empty! Try again buster!");
			}

				}catch(SQLException e){
				e.printStackTrace();
		}
		return null;
	}

	public OneUserToRuleThemAll isDadmin(int idpls){

		OneUserToRuleThemAll user = new OneUserToRuleThemAll();

		try(Connection conn = DriverManager.getConnection(url, username, password)){

			String sql = "SELECT * FROM userwooser WHERE idpls = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, idpls);

			ResultSet rs = ps.executeQuery();
			rs.next();

			user.setIdpls(rs.getInt(1));
			user.setFirstname(rs.getString(2));
			user.setLastnmame(rs.getString(3));
			user.setPsstpsst(rs.getString(4));
			user.setCheckpls(rs.getInt(5));
			user.setSavesave(rs.getInt(6));
			user.setDadmin(rs.getBoolean(7));

		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
