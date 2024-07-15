package org.example.patterns.generative.factory_method.service.save;


import org.example.patterns.generative.factory_method.domain.OrangeFM;
import org.springframework.stereotype.Component;

@Component
public class OrangeFactory implements ConcreteFruitFactory<OrangeFM> {

    @Override
    public OrangeFM create() {
        return new OrangeFM();
    }
}
