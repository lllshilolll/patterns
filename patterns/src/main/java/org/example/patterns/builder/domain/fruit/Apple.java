package org.example.patterns.builder.domain.fruit;

import lombok.*;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Apple extends AbstractFruit {

    private FruitType fruitType;


    @Builder
    public Apple(String name, FruitType fruitType) {
        super(name);
        this.fruitType = fruitType;
    }
}
