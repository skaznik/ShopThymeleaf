package pl.edu.wszib.dao.impl;

import org.springframework.stereotype.Repository;
import pl.edu.wszib.dao.UserDao;
import pl.edu.wszib.domain.User;

import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {
    private Map<Long, User> userMap;
    private static Long id = 1L;

}
