package Spring.project.Login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.project.Login.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	User findByUserName(String userName);

}
