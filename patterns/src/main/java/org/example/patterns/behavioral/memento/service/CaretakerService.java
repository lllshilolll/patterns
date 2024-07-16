package org.example.patterns.behavioral.memento.service;

import java.util.List;

//T - entity
//M - state
public interface CaretakerService<T, M> {

    void setState(T entity);

    M getLastState(T entity);

    List<M> getStates(T entity);

    void restore(T entity);
}
