package org.example.patterns.abstract_factory.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.abstract_factory.service.FruitFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final FruitFactory fruitFactory;

    @Override
    public void run(String... args) {
        log.info("test abstract factory");

        log.info("abstract factory - {}", fruitFactory.createApple());
        log.info("abstract factory - {}", fruitFactory.createOrange());
    }
}
