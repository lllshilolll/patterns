package org.example.patterns.facade.service.save;

import org.example.patterns.facade.domain.AppleF;
import org.springframework.stereotype.Component;

@Component
public class AppleServiceFImpl implements AppleServiceF {
    @Override
    public AppleF get() {
        return AppleF.builder()
                .name("app")
                .weight(100)
                .build();
    }
}
