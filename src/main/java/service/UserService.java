package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domein.MyUser;
import repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository UserRepository;

        public MyUser authenticate(String username, String password) {
            MyUser user = UserRepository.findByUsername(username);
            if (user != null && user.getPassword().equals(password)) {
                return user;
            }
            return null;
        }
    }

