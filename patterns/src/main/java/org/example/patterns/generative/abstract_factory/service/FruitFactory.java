package org.example.patterns.generative.abstract_factory.service;

import org.example.patterns.generative.abstract_factory.domain.AppleAF;
import org.example.patterns.generative.abstract_factory.domain.OrangeAF;

public interface FruitFactory {

    AppleAF createApple();

    OrangeAF createOrange();
}
