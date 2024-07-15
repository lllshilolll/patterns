package org.example.patterns.structural.facade.service;

import org.example.patterns.structural.facade.domain.AbstractFruitF;

import java.util.List;

public interface FruitServiceFacade {

    List<AbstractFruitF> getFruitsByCount(int count);
}
