package example.Controller;

import example.DAO.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

    private UserRepository userRepository;

    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
