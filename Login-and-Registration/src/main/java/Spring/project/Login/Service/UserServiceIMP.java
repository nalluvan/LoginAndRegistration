package Spring.project.Login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import Spring.project.Login.dto.UserDto;
import Spring.project.Login.model.User;
import Spring.project.Login.repo.UserRepo;

@Service
public class UserServiceIMP implements UserService {
	@Autowired
	PasswordEncoder passwordEncoder;
	private UserRepo userRepo;

	public UserServiceIMP(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public User findByUserName(String userName) {

		return userRepo.findByUserName(userName);
	}

	@Override
	public User save(UserDto userDto) {
		User user = new User(userDto.getFullName(), userDto.getPassword(), userDto.getUserName());
		return userRepo.save(user);
	}

}
