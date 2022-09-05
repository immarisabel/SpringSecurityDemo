package nl.marisabel.SpringSecurityDemo.repositories;

import nl.marisabel.SpringSecurityDemo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {

    @Query("""
            SELECT u  FROM Users u WHERE u.username = :username
            """)
    Optional<Users> findUserByUsername(String username);
}
