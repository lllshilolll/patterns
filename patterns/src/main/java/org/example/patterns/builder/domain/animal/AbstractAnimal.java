package org.example.patterns.builder.domain.animal;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public abstract class AbstractAnimal {
    protected String name;
}
