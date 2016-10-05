package test.code;

import model.Book;
import dao.BookDAOImpl;

public class TestBookInsert {

	public static void main(String[] args) throws Exception {
		Book b = new Book();
		b.setName("Nithin");
		b.setCost(1000);
		b.setPublication("Tata McGraw");
		System.out.println(b);

		BookDAOImpl bd = new BookDAOImpl();
		bd.insert(b);
	}

}
