package hu.elte.alkfejl.issuetracker.service;

import hu.elte.alkfejl.issuetracker.model.User;
import hu.elte.alkfejl.issuetracker.repository.UserRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepoitory userRepoitory;

    public void register(User user) {
        userRepoitory.save(user);
    }

    public boolean isValid(User user) {
        return userRepoitory.findByUsernameAndPassword(user.getUsername(), user.getPassword()).isPresent();
    }
}
