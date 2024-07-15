package org.example.patterns.behavioral.chain_of_responsibility.service.validator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.chain_of_responsibility.domain.SaladCR;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Slf4j
@Component
@RequiredArgsConstructor
public class SecondValidatorChain implements ValidatorChain<SaladCR> {

    private final ThirdValidatorChain thirdValidatorChain;

    @Override
    public void validate(SaladCR object) {

        if (!object.getReceipt().matches(".*8.*")) {
            throw new RuntimeException("Second validator chain failed");
        }
        log.info("Second validator chain done");
        thirdValidatorChain.validate(object);
    }
}
