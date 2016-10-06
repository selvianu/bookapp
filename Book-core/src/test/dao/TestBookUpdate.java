package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Book;
import util.ConnectionUtil;

public class TestBookUpdate {

	public static void main(String[] args) throws SQLException, Exception {
		Book b = new Book();
		b.setId(1l);
		b.setName("maths");
update(b);
	}

	public static void update(Book b) throws Exception, SQLException {
		Connection con = ConnectionUtil.getConnection();
		String query = "UPDATE books SET NAME=? WHERE id=?";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, b.getName());
		p.setLong(2, b.getId());
		int rows = p.executeUpdate();
		System.out.println(rows);
	}
}
