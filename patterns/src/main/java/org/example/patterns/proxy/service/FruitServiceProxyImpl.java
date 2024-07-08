package org.example.patterns.proxy.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.proxy.domain.FruitP;
import org.example.patterns.proxy.service.save.FruitServiceP;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FruitServiceProxyImpl implements FruitServiceProxy {

    private final FruitServiceP fruitService;

    @Override
    public FruitP add(FruitP fruitP) {
        log.info("new important logic");
        return fruitService.add(fruitP);
    }

    @Override
    public FruitP update(FruitP fruitP) {
        log.info("new important logic");
        return fruitService.update(fruitP);
    }

    @Override
    public void delete(FruitP fruitP) {
        log.info("new important logic");
        fruitService.delete(fruitP);
    }
}
