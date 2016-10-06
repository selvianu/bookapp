package dao;

import java.util.List;

import model.Book;

public interface BookDAO {
	void insert(Book b) throws Exception;

	void update(Book b)throws Exception;

	void delete(Long id);

	List<Book> findByName(String name);

	List<Book> list();

	Book show(Long id);
}
