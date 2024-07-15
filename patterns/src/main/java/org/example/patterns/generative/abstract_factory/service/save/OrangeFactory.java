package org.example.patterns.generative.abstract_factory.service.save;

import org.example.patterns.generative.abstract_factory.domain.OrangeAF;
import org.springframework.stereotype.Component;

@Component
public class OrangeFactory implements ConcreteAbstractFactory<OrangeAF> {
    @Override
    public OrangeAF create() {
        return new OrangeAF();
    }
}
