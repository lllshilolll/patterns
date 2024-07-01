package org.example.patterns.abstract_factory.service;

import org.example.patterns.abstract_factory.domain.Apple;
import org.example.patterns.abstract_factory.domain.Orange;

public interface FruitFactory {

    Apple createApple();

    Orange createOrange();
}
