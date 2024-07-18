package org.example.patterns.behavioral.strategy;

import org.example.patterns.behavioral.state.domain.Document;
import org.example.patterns.behavioral.state.domain.State;

public interface StateStrategy {

    State getState();

    void doWork(Document document);

}
