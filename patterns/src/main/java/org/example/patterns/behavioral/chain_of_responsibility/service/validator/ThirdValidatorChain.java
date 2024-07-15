package org.example.patterns.behavioral.chain_of_responsibility.service.validator;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.chain_of_responsibility.domain.SaladCR;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Order(3)
@Component
public class ThirdValidatorChain implements ValidatorChain<SaladCR> {

    @Override
    public void validate(SaladCR object) {

        if (object.getVegetableCRList().stream()
                .noneMatch(
                        v -> v.getName().matches("swecla")
                )) {
            throw new RuntimeException("Third validator chain failed");
        }

        log.info("Third validator chain done");
    }
}