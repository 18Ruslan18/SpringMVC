package app;

import dao.UsersDao;
import dao.UsersDaoJdbcTemplateImpl;
import models.User;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.activation.DataSource;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("rusik22801");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/fix_user_db");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl( dataSource);

        List<User> users = usersDao.findAll();

        System.out.println(users);
    }
}
