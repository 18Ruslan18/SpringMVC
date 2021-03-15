package repositories;

import models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepositoriest extends JpaRepository<User, Long> {
    List<User> findAllByFirstName(String firstName);
}