package authentication.example.authenticationWebService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import authentication.example.authenticationWebService.model.UserModel;
import authentication.example.authenticationWebService.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired UserService userService;
	
	@PostMapping("user")
	public ResponseEntity<?> add(@RequestBody UserModel user){
		return userService.add(user);
	}

}
