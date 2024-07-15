package org.example.patterns.generative.factory_method.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.generative.factory_method.domain.FruitTypeFM;
import org.example.patterns.generative.factory_method.service.FruitFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final FruitFactory fruitFactory;

    @Override
    public void run(String... args) {
        log.info("test factory method");
        var apple = fruitFactory.create(FruitTypeFM.APPLE);
        log.info("apple: {}", apple);
    }
}
