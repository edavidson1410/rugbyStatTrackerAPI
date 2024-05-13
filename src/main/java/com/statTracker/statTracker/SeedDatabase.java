package com.statTracker.statTracker;

import com.statTracker.statTracker.models.Player;
import com.statTracker.statTracker.services.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class SeedDatabase {

    private static final Logger log = LoggerFactory.getLogger(SeedDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PlayerRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Player("Eric Davidson", "Jackson, MO", new Date(1992, 7, 26), "St. Louis Bombers")));
            log.info("Preloading " + repository.save(new Player("Aidan Milne", "Motueka, New Zealand", new Date(1995, 4, 24), "St. Louis Bombers")));
        };
    }
}
