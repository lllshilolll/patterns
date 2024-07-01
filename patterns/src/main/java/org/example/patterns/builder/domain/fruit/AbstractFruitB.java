package org.example.patterns.builder.domain.fruit;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class AbstractFruitB {

    private String name;

    public AbstractFruitB(String name) {
        this.name = name;
    }
}
