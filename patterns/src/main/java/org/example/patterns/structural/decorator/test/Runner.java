package org.example.patterns.structural.decorator.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.structural.decorator.domain.FruitD;
import org.example.patterns.structural.decorator.service.FruitServiceDecorator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final FruitServiceDecorator decorator;

    @Override
    public void run(String... args) {
        log.info("test decorator");
        var fruit = FruitD.builder()
                .name("banana")
                .weight(200)
                .build();

        decorator.add(fruit);
        decorator.cutFruit(fruit);

    }
}
