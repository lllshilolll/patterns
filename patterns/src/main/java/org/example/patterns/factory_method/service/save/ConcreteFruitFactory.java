package org.example.patterns.factory_method.service.save;

public interface ConcreteFruitFactory<T> {

    T create();
}
