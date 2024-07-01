package org.example.patterns.builder.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.builder.domain.animal.CatB;
import org.example.patterns.builder.domain.fruit.AppleB;
import org.example.patterns.builder.domain.fruit.FruitTypeB;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("test builder");

        var apple = AppleB.builder()
                .name("apple")
                .fruitTypeB(FruitTypeB.APPLE)
                .build();

        log.info("apple: {}", apple);

        var cat = CatB.builder()
                .name("cat")
                .size(10)
                .build();

        log.info("cat: {}", cat);
    }
}
