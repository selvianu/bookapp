package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import util.ConnectionUtil;
import model.Book;

public class BookDAOImpl implements BookDAO {

	@Override
	public void insert(Book b) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String query = "INSERT INTO books (NAME,cost,publication) VALUES(?,?,?)";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, b.getName());
		p.setInt(2, b.getCost());
		p.setString(3, b.getPublication());
		int rows = p.executeUpdate();
		System.out.println("no of rows inserted" + rows);
	}

	@Override
	public void update(Book b) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String query = "UPDATE books SET NAME=? WHERE id=?";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1, b.getName());
		p.setLong(2, b.getId());
		int rows = p.executeUpdate();
		System.out.println(rows);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Book> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book show(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
