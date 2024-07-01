package org.example.patterns.facade.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class AbstractFruitF {

    private String name;
    private Integer weight;
}
