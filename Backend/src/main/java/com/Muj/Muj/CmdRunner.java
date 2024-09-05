package com.Muj.Muj;

import com.Muj.Muj.Entities.Disaster;
import com.Muj.Muj.Repo.DisasterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CmdRunner {

    @Bean
    CommandLineRunner commandLineRunner(DisasterRepository disasterRepository) {
        return args -> {
            Disaster disaster = new Disaster(
                    1,
                    "flood",
                    "Himachal Pradesh",
                    "Low",
                    10,
                    "Low"
            );
            disasterRepository.saveAll(List.of(disaster));
        };
    }

}
