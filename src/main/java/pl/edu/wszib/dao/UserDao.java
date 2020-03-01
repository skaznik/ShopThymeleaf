package pl.edu.wszib.dao;

import pl.edu.wszib.domain.Product;
import pl.edu.wszib.domain.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void saveUser(User user);

    void removeUser(Long id);

    User getByid(Long id);
}
