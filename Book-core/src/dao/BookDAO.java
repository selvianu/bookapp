package dao;

import java.util.List;

import model.Book;

public interface BookDAO {
	void insert(Book b) throws Exception;

	void update(Book b)throws Exception;

	void delete(Book b) throws Exception;

	List<Book> findByName(String name) throws Exception;

	List<Book> list() throws Exception;

	Book show(Long id) throws Exception;
}
