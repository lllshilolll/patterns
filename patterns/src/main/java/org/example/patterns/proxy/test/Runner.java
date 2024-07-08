package org.example.patterns.proxy.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.proxy.domain.FruitP;
import org.example.patterns.proxy.service.FruitServiceProxy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final FruitServiceProxy fruitService;

    @Override
    public void run(String... args) {
        log.info("test proxy");

        fruitService.add(new FruitP("banana"));
    }
}
