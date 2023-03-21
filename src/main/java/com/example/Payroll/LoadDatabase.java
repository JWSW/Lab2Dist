package com.example.Payroll;

import com.example.Payroll.Repositories.ClientBankRepository;
import com.example.Payroll.model.ClientBank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ClientBankRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new ClientBank("Bilbo Baggins", 1500)));
            log.info("Preloading " + repository.save(new ClientBank("Frodo Baggins", 1650.52)));
//            repository.saveAll(List.of("Bilbo Baggins","Frodo Baggins"))
        };
    }
}