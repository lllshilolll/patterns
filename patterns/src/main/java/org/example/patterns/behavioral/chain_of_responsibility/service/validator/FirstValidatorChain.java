package org.example.patterns.behavioral.chain_of_responsibility.service.validator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.chain_of_responsibility.domain.SaladCR;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Slf4j
@Component
@RequiredArgsConstructor
public class FirstValidatorChain implements ValidatorChain<SaladCR> {

    private final SecondValidatorChain secondValidatorChain;

    @Override
    public void validate(SaladCR object) {

        log.info("First validator chain done");
        secondValidatorChain.validate(object);
    }
}
