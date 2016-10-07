package dao;

public interface UserDAO {

	void save(User user) throws Exception;
	
	User login (String username,String password) throws Exception;
}
