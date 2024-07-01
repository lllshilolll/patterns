package org.example.patterns.decorator.service.old;

import org.example.patterns.decorator.domain.Fruit;

public interface FruitService {

    Fruit add(Fruit fruit);

    Fruit remove(Fruit fruit);

    Fruit update(Fruit fruit);

}
