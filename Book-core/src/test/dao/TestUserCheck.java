package test.dao;

import dao.UserDAOImpl;

public class TestUserCheck {

	public static void main(String[] args) throws Exception {
		String username = "nareshhari";
		String password = "spinteam";
		UserDAOImpl udi = new UserDAOImpl();
		udi.login(username, password);
		// usercheck(username, password);
	}

}
