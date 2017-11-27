package authentication.example.authenticationWebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import authentication.example.authenticationWebService.entity.User;
import authentication.example.authenticationWebService.model.UserModel;
import authentication.example.authenticationWebService.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired UserRepository userRepository;
	
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
	
	public ResponseEntity<?> add(UserModel user){
		if(findByUserName(user.getUserName())!=null || user.getUserName().length()<3)
		return new ResponseEntity<>("El nombre de usuario ya existe",HttpStatus.UNAUTHORIZED);
		userRepository.save(new User(user.getUserName(),user.getPassword()));
		return new ResponseEntity<>("Usuario creado con exito!",HttpStatus.CREATED);
	}
	
}
