package br.com.bruno.aula_spring_data_jpa;

import br.com.bruno.aula_spring_data_jpa.model.User;
import br.com.bruno.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("BRUNO");

        for (User user : users) {
            System.out.println(user);
        }
    }
}
