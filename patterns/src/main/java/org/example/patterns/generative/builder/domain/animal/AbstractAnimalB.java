package org.example.patterns.generative.builder.domain.animal;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public abstract class AbstractAnimalB {
    protected String name;
}
