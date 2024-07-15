package org.example.patterns.behavioral.chain_of_responsibility.service.validator;

public interface ValidatorChain<T> {

    void validate(T object);
}
