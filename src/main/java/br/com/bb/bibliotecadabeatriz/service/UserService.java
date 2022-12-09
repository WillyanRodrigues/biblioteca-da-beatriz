package br.com.bb.bibliotecadabeatriz.service;

import br.com.bb.bibliotecadabeatriz.model.User;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserService {

    User createUser (User user);

    Optional<User> getUser(Long id);
}
