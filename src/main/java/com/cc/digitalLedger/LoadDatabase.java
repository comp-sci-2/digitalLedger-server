package com.cc.digitalLedger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


    @Bean
    CommandLineRunner initDatabase(TransactionRepository repository) {
        return args -> {
            for(Transaction t: Ledger.load()) {
                log.info("Preloading " + repository.save(t));
            }
        };
    }
}
