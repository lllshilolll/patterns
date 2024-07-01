package org.example.patterns.builder.domain.fruit;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class AbstractFruit {

    private String name;

    public AbstractFruit(String name) {
        this.name = name;
    }
}
