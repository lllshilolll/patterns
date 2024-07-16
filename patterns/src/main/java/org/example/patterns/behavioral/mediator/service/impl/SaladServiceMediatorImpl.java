package org.example.patterns.behavioral.mediator.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.patterns.behavioral.mediator.domain.AbstractFruitM;
import org.example.patterns.behavioral.mediator.domain.SaladM;
import org.example.patterns.behavioral.mediator.service.AppleMService;
import org.example.patterns.behavioral.mediator.service.OrangeMService;
import org.example.patterns.behavioral.mediator.service.SaladServiceMediator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class SaladServiceMediatorImpl implements SaladServiceMediator {

    private final AppleMService appleMService;
    private final OrangeMService orangeMService;

    @Override
    public SaladM create(String name, int apple, int orange) {
        List<AbstractFruitM> list = new ArrayList<>();
        list.addAll(
                IntStream.range(0, orange).mapToObj(d -> orangeMService.get()).toList()
        );

        list.addAll(
                IntStream.range(0, apple).mapToObj(d -> appleMService.get()).toList()
        );

        return new SaladM(name, list);
    }
}
