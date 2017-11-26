package authentication.example.authenticationWebService;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import authentication.example.authenticationWebService.initdatabase.TestInitUser;

@SpringBootApplication
public class AuthenticationWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationWebServiceApplication.class, args);
	}
	@Autowired TestInitUser test;
	@PostConstruct
	void init() {
	test.initDatabase();
	}
}
