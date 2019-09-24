package test1;

import sample.test.User;

public interface UserDAO {
	public boolean addUser(sample.test.User po);
public User deleteUser(User po);
public User updateUser(User po);
User findUser(int id);
java.util.List<User>getAllUser();
}