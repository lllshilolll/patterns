package org.example.patterns.behavioral.iterator.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.iterator.domain.FruitI;
import org.example.patterns.behavioral.iterator.service.FruitIList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        log.info("test iterator");

        FruitI apple = new FruitI("apple");
        FruitI banana = new FruitI("banana");
        FruitI grape = new FruitI("grape");

        FruitIList fruitIList = new FruitIList(apple, banana, grape);

        log.info("forEach()");
        fruitIList.forEach(System.out::println);

        log.info("while(hasNext())");
        var iterator = fruitIList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
