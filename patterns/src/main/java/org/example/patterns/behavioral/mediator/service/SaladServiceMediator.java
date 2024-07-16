package org.example.patterns.behavioral.mediator.service;

import org.example.patterns.behavioral.mediator.domain.SaladM;

public interface SaladServiceMediator {

    SaladM create(String name, int apple, int orange);
}
