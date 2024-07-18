package org.example.patterns.behavioral.state.strategy;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.state.domain.Document;
import org.example.patterns.behavioral.state.domain.State;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NewStateStrategyImpl implements StateStrategy {

    @Override
    public State getState() {
        return State.NEW;
    }

    @Override
    public void doWork(Document document) {
        log.info("transferring the document {} to state {}", document, getState());
    }
}
