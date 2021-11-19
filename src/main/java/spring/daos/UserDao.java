package spring.daos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import spring.models.User;

@Repository
public class UserDao {

	public List<User> getUsers() {
		List<User> list = new ArrayList<>();

		list.add(new User(1, "abc@gmail.com", "123", "de-active"));
		list.add(new User(2, "abc12@gmail.com", "124", "active"));
		list.add(new User(3, "abc34@gmail.com", "abc", "de-active"));
		list.add(new User(4, "admin@gmail.com", "123456", "active"));

		return list;
	}

}
