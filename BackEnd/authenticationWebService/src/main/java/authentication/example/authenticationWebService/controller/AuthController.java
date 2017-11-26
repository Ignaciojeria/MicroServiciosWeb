package authentication.example.authenticationWebService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import authentication.example.authenticationWebService.model.UserModel;
import authentication.example.authenticationWebService.service.AuthService;

@RestController
public class AuthController {
	
	@Autowired AuthService authService;
	
	@PostMapping("auth")
	public ResponseEntity<?> useAuth(@RequestBody UserModel userModel) {
		return authService.validateCredentials(userModel);
	}


}
