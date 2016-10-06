package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
		System.out.println("no of rows updated:" + rows);
	}

	@Override
	public void delete(Book b) throws Exception {
		Connection con = ConnectionUtil.getConnection();
		String query = "DELETE FROM books WHERE id=?";
		PreparedStatement p = con.prepareStatement(query);
		p.setLong(1, b.getId());
		int rows = p.executeUpdate();
		System.out.println("no of rows deleted" + rows);
	}

	@Override
	public List<Book> findByName(String name) throws Exception {
		Connection con=ConnectionUtil.getConnection();
		String query = "SELECT id,NAME,cost,publication FROM books WHERE NAME=?";
		PreparedStatement p = con.prepareStatement(query);
		p.setString(1,name );

		ArrayList<Book> list = new ArrayList<Book>();
		ResultSet rs = p.executeQuery();
		while (rs.next()) {
			// get column values
			Long id = rs.getLong("id");
			String name1 = rs.getString("name");
			Integer cost = rs.getInt("cost");
			String publication = rs.getString("publication");

			// pack column values to object
			Book book = new Book();
			book.setId(id);
			book.setName(name1);
			book.setCost(cost);
			book.setPublication(publication);

			// store it in list
			list.add(book);

		}

		return list;
	}

	@Override
	public List<Book> list() throws Exception {
		Connection con=ConnectionUtil.getConnection();
		String query = "SELECT id,NAME,cost,publication FROM books ";
		PreparedStatement p = con.prepareStatement(query);
		

		ArrayList<Book> list = new ArrayList<Book>();
		ResultSet rs = p.executeQuery();
		while (rs.next()) {
			// get column values
			Long id = rs.getLong("id");
			String name1 = rs.getString("name");
			Integer cost = rs.getInt("cost");
			String publication = rs.getString("publication");

			// pack column values to object
			Book book = new Book();
			book.setId(id);
			book.setName(name1);
			book.setCost(cost);
			book.setPublication(publication);

			// store it in list
			list.add(book);

		}

		return list;
	}

	@Override
	public Book show(Long id) throws Exception {
		Connection con=ConnectionUtil.getConnection();
		String query = "SELECT id,NAME,cost,publication FROM books where id = ?";
		PreparedStatement p = con.prepareStatement(query);
		p.setLong(1, id);
		

		Book book  = null;
		ResultSet rs = p.executeQuery();
		if (rs.next()) {
			// get column values
			Long id1 = rs.getLong("id");
			String name1 = rs.getString("name");
			Integer cost = rs.getInt("cost");
			String publication = rs.getString("publication");

			// pack column values to object
			book = new Book();
			book.setId(id1);
			book.setName(name1);
			book.setCost(cost);
			book.setPublication(publication);


		}

		return book;
	}

}
