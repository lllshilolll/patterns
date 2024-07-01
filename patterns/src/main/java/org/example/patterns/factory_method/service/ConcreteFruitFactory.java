package org.example.patterns.factory_method.service;

public interface ConcreteFruitFactory<T> {

    T create();
}
