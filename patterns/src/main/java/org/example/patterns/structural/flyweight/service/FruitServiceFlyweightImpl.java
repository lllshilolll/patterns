package org.example.patterns.structural.flyweight.service;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.structural.flyweight.domain.FruitFW;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FruitServiceFlyweightImpl implements FruitServiceFlyweight {
    @Override
    public FruitFW add(FruitFW fruitFW) {
        //check: if fruit already create - don't create
        log.info("add via flyweight");
        return fruitFW;
    }

    @Override
    public FruitFW get(String name) {
        log.info("get via flyweight");
        return new FruitFW(name);
    }
}
