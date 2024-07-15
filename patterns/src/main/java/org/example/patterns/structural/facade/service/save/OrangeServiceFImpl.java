package org.example.patterns.structural.facade.service.save;

import org.example.patterns.structural.facade.domain.OrangeF;
import org.springframework.stereotype.Component;

@Component
public class OrangeServiceFImpl implements OrangeServiceF {
    @Override
    public OrangeF get() {
        return OrangeF.builder()
                .name("orange")
                .weight(200)
                .build();
    }
}
