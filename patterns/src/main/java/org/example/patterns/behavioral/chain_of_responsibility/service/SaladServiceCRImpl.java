package org.example.patterns.behavioral.chain_of_responsibility.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.chain_of_responsibility.domain.SaladCR;
import org.example.patterns.behavioral.chain_of_responsibility.domain.VegetableCR;
import org.example.patterns.behavioral.chain_of_responsibility.service.validator.FirstValidatorChain;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SaladServiceCRImpl implements SaladServiceCR {


    //    private final List<ValidatorChain<SaladCR>> validatorChains;
    private final FirstValidatorChain firstValidatorChain;

    @Override
    public SaladCR create(String name, String receipt, List<VegetableCR> vegetableCRList) {
        SaladCR salad = new SaladCR(name, vegetableCRList, receipt);

        //validation
        validate(salad);

        return salad;
    }

    private void validate(SaladCR salad) {
        firstValidatorChain.validate(salad);
//        validatorChains.forEach(validator -> validator.validate(salad));
        log.info("Validation done");
    }
}
