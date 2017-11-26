package authentication.example.authenticationWebService.initdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import authentication.example.authenticationWebService.entity.User;
import authentication.example.authenticationWebService.repository.UserRepository;

@Component
public class TestInitUser {

	@Autowired UserRepository userRepository;
	
	public void initDatabase(){
		userRepository.save(new User("admin","admin"));
		userRepository.save(new User("nacho","nacho"));
		userRepository.save(new User("brian","brian"));
	}
}
