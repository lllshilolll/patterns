package org.example.patterns.behavioral.mediator.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.mediator.service.SaladServiceMediator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final SaladServiceMediator saladServiceMediator;

    @Override
    public void run(String... args) {
        log.info("test mediator");

        var salad = saladServiceMediator.create("fruit salad", 2, 3);

        log.info(salad.toString());

    }
}
