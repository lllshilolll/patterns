package org.example.patterns.builder.domain.fruit;

import lombok.*;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Orange extends AbstractFruit {

    private FruitType fruitType;


    @Builder
    public Orange(String name, FruitType fruitType) {
        super(name);
        this.fruitType = fruitType;
    }
}
