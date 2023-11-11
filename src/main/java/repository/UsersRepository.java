package repository;

import models.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface UsersRepository  {

    void save (User user) throws SQLException;
//    List findAllByAge();

//    List findAllByName();
//
//    Optional<User> findByLogin(User login);
}
