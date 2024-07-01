package org.example.patterns.abstract_factory.service;

import org.example.patterns.abstract_factory.domain.AppleAF;
import org.example.patterns.abstract_factory.domain.OrangeAF;

public interface FruitFactory {

    AppleAF createApple();

    OrangeAF createOrange();
}
