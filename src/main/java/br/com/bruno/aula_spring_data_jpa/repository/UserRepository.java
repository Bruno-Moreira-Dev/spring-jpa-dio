package br.com.bruno.aula_spring_data_jpa.repository;

import br.com.bruno.aula_spring_data_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Query method
    List<User> findByNameContaining(String name);

    // Query method
    User findByUsername(String username);

    // Query override
    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filtrarPorNome(@Param("name") String name);

}
