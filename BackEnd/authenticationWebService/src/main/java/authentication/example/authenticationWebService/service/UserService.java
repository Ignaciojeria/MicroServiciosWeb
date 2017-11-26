package authentication.example.authenticationWebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import authentication.example.authenticationWebService.entity.User;
import authentication.example.authenticationWebService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired UserRepository userRepository;
	
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
}
