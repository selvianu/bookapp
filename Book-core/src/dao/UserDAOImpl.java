package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.ConnectionUtil;

public class UserDAOImpl implements UserDAO {

	@Override
	public void save(User user) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String query = "INSERT INTO user_details (NAME, username, PASSWORD) VALUES (?,?,?)";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, user.getName());
		p.setString(2, user.getUsername());
		p.setString(3, user.getPassword());
		int rows = p.executeUpdate();
		System.out.println("no of user added" + rows);

	}

	@Override
	public User login(String username, String password) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String query = "SELECT NAME FROM user_details WHERE username=? AND PASSWORD=?";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, username);
		p.setString(2, password);
		ResultSet rs = p.executeQuery();
		if (rs.next()) {
			String name1 = rs.getString("name");
			User user = new User();
			user.setName(name1);
			System.out.println(user);	
	}
		return null;

}
}