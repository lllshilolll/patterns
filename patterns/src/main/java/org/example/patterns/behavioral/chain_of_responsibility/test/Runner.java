package org.example.patterns.behavioral.chain_of_responsibility.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.chain_of_responsibility.domain.VegetableCR;
import org.example.patterns.behavioral.chain_of_responsibility.service.SaladServiceCR;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final SaladServiceCR service;

    @Override
    public void run(String... args) {
        log.info("test chain_of_responsibility");

        service.create("Swecolnic", "1238",
                List.of(new VegetableCR("swecla"),
                        new VegetableCR("ogurec")
                )
        );

        service.create("Apple cake", "876",
                List.of(new VegetableCR("swecla"))
        );

        service.create("fake cake", "12876", null);


//        log.info("abstract factory - {}", fruitFactory.createApple());
//        log.info("abstract factory - {}", fruitFactory.createOrange());
    }
}
