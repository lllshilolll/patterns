package org.example.patterns.behavioral.mediator.service.impl;

import org.example.patterns.behavioral.mediator.domain.AppleM;
import org.example.patterns.behavioral.mediator.service.AppleMService;
import org.springframework.stereotype.Service;

@Service
public class AppleMServiceImpl implements AppleMService {

    @Override
    public AppleM get() {
        return new AppleM("green apple");
    }
}
