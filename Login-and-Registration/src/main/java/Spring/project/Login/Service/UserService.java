package Spring.project.Login.Service;

import Spring.project.Login.dto.UserDto;
import Spring.project.Login.model.User;

public interface UserService {
	User findByUserName(String userName);
	User save(UserDto userDto);

}
