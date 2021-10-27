package appcent.intern.appcent_applicationJ8.service;

import appcent.intern.appcent_applicationJ8.model.User;
import appcent.intern.appcent_applicationJ8.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
