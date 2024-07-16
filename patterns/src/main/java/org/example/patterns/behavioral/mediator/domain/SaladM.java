package org.example.patterns.behavioral.mediator.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class SaladM extends AbstractDomainM {
    private final List<AbstractFruitM> ingredients;

    public SaladM(String name, List<AbstractFruitM> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Salad{name = " + getName() + ", ingredients = " + ingredients.size() + "}";
    }
}
