package service;

import javax.transaction.Transactional;

import model.User;
import org.springframework.stereotype.Service;

import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;

	protected UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		for(User user : userRepository.findAll()){
			users.add(user);
		}
		return users;
	}
}
