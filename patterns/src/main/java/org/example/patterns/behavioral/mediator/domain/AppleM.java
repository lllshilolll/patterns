package org.example.patterns.behavioral.mediator.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AppleM extends AbstractFruitM {
    public AppleM(String name) {
        super(name);
    }
}
