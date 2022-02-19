package in.nareshit.raghu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nareshit.raghu.entity.User;
import in.nareshit.raghu.repo.UserRepository;
import in.nareshit.raghu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public Long saveUser(User user) {
		// TODO Auto-generated method stub
		
		return repo.save(user).getId();
	}

	@Override
	public void deleteUser(Long Id) {
		repo.deleteById(Id);
		
	}

	@Override
	public void updateUser(User user) {
	
		repo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<User> getOneUserByID(Long Id) {
		// TODO Auto-generated method stub
		return repo.findById(Id);
	}

}
