package test.dao;

import dao.User;
import dao.UserDAOImpl;

public class TestUserSave {

	public static void main(String[] args) throws Exception {
		User u = new User();
		u.setName("sanjay");
		u.setUsername("ssanjai");
		u.setPassword("saravanan");
		UserDAOImpl ud = new UserDAOImpl();
		ud.save(u);
	}

}
