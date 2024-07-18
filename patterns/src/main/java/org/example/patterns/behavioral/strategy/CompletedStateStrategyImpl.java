package org.example.patterns.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.state.domain.Document;
import org.example.patterns.behavioral.state.domain.State;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CompletedStateStrategyImpl implements StateStrategy {

    @Override
    public State getState() {
        return State.COMPLETED;
    }

    @Override
    public void doWork(Document document) {
        log.info("transferring the document {} to state {}", document, getState());
    }
}
