package org.example.patterns.behavioral.mediator.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class OrangeM extends AbstractFruitM {
    public OrangeM(String name) {
        super(name);
    }
}
