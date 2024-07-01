package org.example.patterns.builder.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.builder.domain.animal.Cat;
import org.example.patterns.builder.domain.fruit.Apple;
import org.example.patterns.builder.domain.fruit.FruitType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("test builder");

        var apple = Apple.builder()
                .name("apple")
                .fruitType(FruitType.APPLE)
                .build();

        log.info("apple: {}", apple);

        var cat = Cat.builder()
                .name("cat")
                .size(10)
                .build();

        log.info("cat: {}", cat);
    }
}
