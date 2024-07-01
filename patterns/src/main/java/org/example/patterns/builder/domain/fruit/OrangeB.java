package org.example.patterns.builder.domain.fruit;

import lombok.*;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrangeB extends AbstractFruitB {

    private FruitTypeB fruitTypeB;


    @Builder
    public OrangeB(String name, FruitTypeB fruitTypeB) {
        super(name);
        this.fruitTypeB = fruitTypeB;
    }
}
