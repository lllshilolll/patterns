package org.example.patterns.generative.factory_method.service.save;

import org.example.patterns.generative.factory_method.domain.AppleFM;
import org.springframework.stereotype.Component;

@Component
public class AppleFactory implements ConcreteFruitFactory<AppleFM> {

    @Override
    public AppleFM create() {
        return new AppleFM();
    }
}
