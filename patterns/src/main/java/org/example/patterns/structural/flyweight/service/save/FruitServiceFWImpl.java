package org.example.patterns.structural.flyweight.service.save;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.structural.flyweight.domain.FruitFW;
import org.example.patterns.structural.flyweight.service.FruitServiceFlyweight;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
public class FruitServiceFWImpl implements FruitServiceFW {

    private final FruitServiceFlyweight flyweight;

    @Override
    public FruitFW add(FruitFW fruitFW) {
        log.info("add fruit {}", fruitFW);
        //optimization create method
        return flyweight.add(fruitFW);
    }

    @Override
    public FruitFW update(FruitFW fruitFW) {
        log.info("update fruit {}", fruitFW);
        return fruitFW;
    }

    @Override
    public void delete(FruitFW fruitFW) {
        log.info("delete fruit {}", fruitFW);
    }
}
