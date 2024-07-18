package org.example.patterns.behavioral.state.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.state.domain.Document;
import org.example.patterns.behavioral.state.domain.State;
import org.example.patterns.behavioral.strategy.StateStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentStateContextService {

    private final List<StateStrategy> stateStrategy;

    public void doWork(Document document, State nextState) {
        log.info("working on the document {} and transferring to state {}", document, nextState);

        getStateStrategy(nextState).doWork(document);
        document.setState(nextState);
    }

    private StateStrategy getStateStrategy(State state) {
        return stateStrategy.stream().filter(docStrategy -> docStrategy.getState() == state)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }
}
