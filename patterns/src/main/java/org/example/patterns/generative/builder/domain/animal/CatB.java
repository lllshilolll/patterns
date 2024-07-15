package org.example.patterns.generative.builder.domain.animal;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
public class CatB extends AbstractAnimalB {

    private int size;
}
