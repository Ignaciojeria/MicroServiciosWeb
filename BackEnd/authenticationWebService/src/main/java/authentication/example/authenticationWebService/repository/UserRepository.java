package authentication.example.authenticationWebService.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import authentication.example.authenticationWebService.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	User findByUserNameAndPassword(String username,String password);
}
