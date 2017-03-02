package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserService {


	private final UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		for(User user : userRepository.findAll()){
			users.add(user);
		}
		return users;
	}

    public void save(User user) {
		userRepository.save(user);
    }

	public void getUserByUsername(String username) {
		userRepository.getUserByUsername(username);
	}

	public boolean exists(String username){
		return userRepository.exists(username);
	}

	public void delete(int id) {
		userRepository.delete(String.valueOf(id));
	}
}
