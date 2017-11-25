package authentication.example.authenticationWebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import authentication.example.authenticationWebService.entity.User;
import authentication.example.authenticationWebService.model.UserModel;
import authentication.example.authenticationWebService.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired UserRepository userRepository;

	public boolean iUserExists(UserModel userModel) {
		User user=userRepository.findByUserNameAndPassword(userModel.getUserName(),userModel.getPassword());
		if(user!=null)
		return true;
		else return false;
	}

}
