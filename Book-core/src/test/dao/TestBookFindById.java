package test.dao;

import dao.BookDAOImpl;
import model.Book;

public class TestBookFindById {

	public static void main(String[] args) throws Exception {

		Long bookId = 5L;

		BookDAOImpl bd = new BookDAOImpl();
		Book book = bd.show(bookId);

		System.out.println(book);

	}

}
