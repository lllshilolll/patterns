package org.example.patterns.structural.facade.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.structural.facade.service.FruitServiceFacade;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final FruitServiceFacade facade;

    //
    @Override
    public void run(String... args) {
        log.info("test facade");
        var list1 = facade.getFruitsByCount(1);
        log.info("list1 {}", list1.toString());
        var list2 = facade.getFruitsByCount(5);
        log.info("list2 {}", list2.toString());

    }
}
