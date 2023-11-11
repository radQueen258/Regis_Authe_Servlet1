package repository;

import java.sql.Connection;
import java.sql.Statement;

public class UsersRepositoryJdbclmpl {
    private Connection connection;
    private Statement statement;

    private static final String SQL_INSERT_INTO_USERS = "insert into driver(name, surname, password, age) values";

    public UsersRepositoryJdbclmpl(Connection connection, Statement statement) {
        this.statement = statement;
        this.connection = connection;
    }


}
