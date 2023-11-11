package repository;

import models.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class UsersRepositoryJdbclmpl implements UsersRepository{
    private Connection connection;
    private Statement statement;

    private static final String SQL_INSERT_INTO_USERS = "insert into users(name, surname, password) values ";

    public UsersRepositoryJdbclmpl(Connection connection, Statement statement) {
        this.statement = statement;
        this.connection = connection;
    }

    @Override
    public void save(User user) throws SQLException {
        String sql = SQL_INSERT_INTO_USERS + "('" + user.getName() + "', '" + user.getSurname() + "' , '" + user.getPassword() +"');";

        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }


//    @Override
//    public List findAllByName() {
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from driver");
//            List<User> result = new ArrayList<>();
//            while (resultSet.next()) {
//                User user = User.builder()
//                        .id(resultSet.getLong("id"))
//                        .name(resultSet.getString("first_name"))
//                        .surname(resultSet.getString("last_name"))
//                        .build();
//                result.add(user);
////                if (user.getAge().equals(age)) {
////                    result.add(user);
////                }
//            }
//            if (result.isEmpty()) {
//                System.out.println("По введенному возврасту ничего не найдено...");
//            }
//            return result;
//        } catch (SQLException e) {
//            throw new IllegalStateException(e);
//        }
//    }

//    @Override
//    public void save(User entity) {
//        String sql = SQL_INSERT_INTO_USERS + "('" + entity.getPassword() + "', '" + entity.getName() + "', '" +entity.getSurname() + "');";
//        try {
//            statement.executeUpdate(sql);
//        } catch (SQLException e) {
//            throw new IllegalArgumentException(e);
//        }
//        System.out.println(entity.getPassword() + " " + entity.getName() + " " + entity.getSurname());
//
//    }

    
}

