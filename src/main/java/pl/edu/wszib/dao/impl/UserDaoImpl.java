package pl.edu.wszib.dao.impl;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.dao.UserDao;
import pl.edu.wszib.domain.Product;
import pl.edu.wszib.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
    private Map<Long, User> userMap;
    private static Long id = 1L;

    public UserDaoImpl() {
        this.userMap = new HashMap<>();
        prepareUserList();
    }

    @Override
    public void saveUser(User user) {
        if (user.getId() < 1) {
            user.setId(id);
            id++;
        }
        userMap.put(user.getId(), user);
    }

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void removeUser(Long id) {
        userMap.remove(id);
    }

    @Override
    public User getByid(Long id) {
        return userMap.get(id);
    }

    private void prepareUserList() {
        User user = new User();
        user.setLogin("User1");
        user.setEmail("jakiś@emial");
        user.setAge(40);
        user.setCountry("USA");
        user.setActive(true);
        saveUser(user);

        User user1 = new User();
        user1.setLogin("User2");
        user1.setEmail("inny@emial");
        user1.setAge(18);
        user1.setCountry("Wyspy owcze");
        user1.setActive(false);
        saveUser(user1);

    }
}
