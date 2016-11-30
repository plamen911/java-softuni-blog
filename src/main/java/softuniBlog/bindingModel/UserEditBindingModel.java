package softuniBlog.bindingModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import softuniBlog.entity.Role;
import softuniBlog.entity.User;
import softuniBlog.repository.RoleRepository;
import softuniBlog.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserEditBindingModel extends UserBindingModel {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

}
