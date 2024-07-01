package org.example.patterns.decorator.service.old;

import org.example.patterns.decorator.domain.Fruit;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceImpl implements FruitService {
    @Override
    public Fruit add(Fruit fruit) {
        return new Fruit();
    }

    @Override
    public Fruit remove(Fruit fruit) {
        return null;
    }

    @Override
    public Fruit update(Fruit fruit) {
        return new Fruit();
    }
}
