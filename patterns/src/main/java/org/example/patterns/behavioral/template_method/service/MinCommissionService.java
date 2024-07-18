package org.example.patterns.behavioral.template_method.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MinCommissionService extends AbstractCommissionService {


    @Override
    protected Integer getCommissionSize() {
        return 5;
    }

    @Override
    protected void printMessage() {
        log.info("Min mode commission");
    }
}
