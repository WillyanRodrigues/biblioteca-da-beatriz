package br.com.bb.bibliotecadabeatriz.service;

import br.com.bb.bibliotecadabeatriz.model.User;
import br.com.bb.bibliotecadabeatriz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> getUser(Long id) {
        return repository.findById(id);
    }
}
