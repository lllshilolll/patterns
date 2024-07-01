package org.example.patterns.builder.domain.animal;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper = true)
public class Cat extends AbstractAnimal {

    private int size;
}
