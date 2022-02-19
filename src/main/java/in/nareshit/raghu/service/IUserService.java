package in.nareshit.raghu.service;

import java.util.List;
import java.util.Optional;

import in.nareshit.raghu.entity.User;

public interface IUserService {
	
	Long saveUser(User user);
	void deleteUser(Long Id);
	void updateUser(User user);
	List<User> getAllUsers();
	Optional<User> getOneUserByID(Long Id);

	
}
