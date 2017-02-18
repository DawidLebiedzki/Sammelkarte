package service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import repository.UserRepository;

@Service
@Transactional
public class UserService {

	private final UserRepository repository;
	
	public UserService(UserRepository repository){
		this.repository = repository;
	}
	
	
}
