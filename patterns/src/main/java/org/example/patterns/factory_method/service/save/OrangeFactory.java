package org.example.patterns.factory_method.service.save;


import org.example.patterns.factory_method.domain.OrangeFM;
import org.springframework.stereotype.Component;

@Component
public class OrangeFactory implements ConcreteFruitFactory<OrangeFM> {

    @Override
    public OrangeFM create() {
        return new OrangeFM();
    }
}
