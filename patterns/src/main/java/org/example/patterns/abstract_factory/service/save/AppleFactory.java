package org.example.patterns.abstract_factory.service.save;

import org.example.patterns.abstract_factory.domain.AppleAF;
import org.springframework.stereotype.Component;

@Component
public class AppleFactory implements ConcreteAbstractFactory<AppleAF> {
    @Override
    public AppleAF create() {
        return new AppleAF();
    }
}
