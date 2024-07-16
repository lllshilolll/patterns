package org.example.patterns.behavioral.mediator.service.impl;

import org.example.patterns.behavioral.mediator.domain.OrangeM;
import org.example.patterns.behavioral.mediator.service.OrangeMService;
import org.springframework.stereotype.Service;

@Service
public class OrangeMServiceImpl implements OrangeMService {

    @Override
    public OrangeM get() {
        return new OrangeM("testy orange");
    }
}
