package org.example.patterns.structural.proxy.service.save;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.structural.proxy.domain.FruitP;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Data
public class FruitServicePImpl implements FruitServiceP {

    @Override
    public FruitP add(FruitP fruitP) {
        log.info("add fruit {}", fruitP);
        return fruitP;
    }

    @Override
    public FruitP update(FruitP fruitP) {
        log.info("update fruit {}", fruitP);
        return fruitP;
    }

    @Override
    public void delete(FruitP fruitP) {
        log.info("delete fruit {}", fruitP);
    }
}
