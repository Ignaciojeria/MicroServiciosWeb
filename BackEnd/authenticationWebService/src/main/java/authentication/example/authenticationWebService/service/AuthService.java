package authentication.example.authenticationWebService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



import authentication.example.authenticationWebService.entity.User;
import authentication.example.authenticationWebService.jwt.JwtTokenUtil;
import authentication.example.authenticationWebService.model.UserModel;
import authentication.example.authenticationWebService.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired UserRepository userRepository;
    
	@Autowired
    private JwtTokenUtil jwtTokenUtil;
	
	public ResponseEntity<?> validateCredentials(UserModel userModel){
		User user=userRepository.findByUserNameAndPassword(userModel.getUserName(),userModel.getPassword());
		if(user!=null) {
			final String token = jwtTokenUtil.setUserForClaimsAndgenerateToken(user);	
			return new ResponseEntity<>(token,HttpStatus.CREATED);
		}	
		return new ResponseEntity<>("user not found",HttpStatus.UNAUTHORIZED);
	}

}
