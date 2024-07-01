package org.example.patterns.decorator.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.decorator.domain.Fruit;
import org.example.patterns.decorator.service.FruitServiceDecorator;
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
        var fruit = Fruit.builder()
                .name("banana")
                .weight(200)
                .build();

        decorator.add(fruit);
        decorator.cutFruit(fruit);

    }
}
