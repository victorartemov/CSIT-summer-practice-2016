package com.epam.sproject.dao;


import com.epam.sproject.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/**
 * @author Vadim
 */
@Repository
public class UserDAOImplementation implements UserDAO {


	private Set<User> DATABASE = new HashSet<>();

	{
		DATABASE.add(new User("user1", "pass1"));
		DATABASE.add(new User("user2", "pass2"));
		DATABASE.add(new User("user3", "pass3"));
		DATABASE.add(new User("user4", "pass4"));
		DATABASE.add(new User("user5", "pass5"));
	}

	@Override
	public boolean add(User user) {
		DATABASE.add(user);
		return true;
	}

	@Override
	public void edit(User user) {
		DATABASE.add(user);

	}


	@Override
	public User getUserById(int id) {
		for (User user : DATABASE) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public User getUserByLoginPass(String login, String password) {
		for (User user : DATABASE) {
			if (user.getLogin().compareTo(login) == 0 && user.getPassword().compareTo(password) == 0)
				return user;
		}
		return null;
	}

}
