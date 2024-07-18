package org.example.patterns.behavioral.observer.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.observer.domain.FruitO;
import org.example.patterns.behavioral.observer.service.custom.MyFruitOService;
import org.example.patterns.behavioral.observer.service.jdk.FruitOService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final FruitOService jdkFruitOService;
    private final MyFruitOService customFruitOService;

    @Override
    public void run(String... args) {
        log.info("test jdk observer");

        jdkFruitOService.addFruit(new FruitO("apple"));

        log.info("test custom observer");

        customFruitOService.add(new FruitO("banana"));
    }
}
