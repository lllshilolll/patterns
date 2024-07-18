package org.example.patterns.behavioral.template_method.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MaxCommissionService extends AbstractCommissionService {


    @Override
    protected Integer getCommissionSize() {
        return 100;
    }

    @Override
    protected void printMessage() {
        log.info("Max mode commission");
    }
}
