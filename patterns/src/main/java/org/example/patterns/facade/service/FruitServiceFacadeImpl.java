package org.example.patterns.facade.service;

import lombok.RequiredArgsConstructor;
import org.example.patterns.facade.domain.AbstractFruitF;
import org.example.patterns.facade.service.save.AppleServiceF;
import org.example.patterns.facade.service.save.OrangeServiceF;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FruitServiceFacadeImpl implements FruitServiceFacade {

    private final AppleServiceF appleServiceF;
    private final OrangeServiceF orangeServiceF;

    @Override
    public List<AbstractFruitF> getFruitsByCount(int count) {
        if (count < 2) {
            return List.of(appleServiceF.get());
        } else {
            return List.of(orangeServiceF.get());
        }
    }
}
