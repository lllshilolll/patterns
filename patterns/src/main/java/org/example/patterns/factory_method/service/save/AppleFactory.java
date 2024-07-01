package org.example.patterns.factory_method.service.save;

import org.example.patterns.factory_method.domain.AppleFM;
import org.springframework.stereotype.Component;

@Component
public class AppleFactory implements ConcreteFruitFactory<AppleFM> {

    @Override
    public AppleFM create() {
        return new AppleFM();
    }
}
