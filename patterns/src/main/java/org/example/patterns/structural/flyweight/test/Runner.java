package org.example.patterns.structural.flyweight.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.structural.flyweight.domain.FruitFW;
import org.example.patterns.structural.flyweight.service.save.FruitServiceFW;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final FruitServiceFW serviceFW;

    @Override
    public void run(String... args) {
        log.info("test flyweight");
        serviceFW.add(new FruitFW("apple"));
    }
}
