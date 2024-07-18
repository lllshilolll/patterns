package org.example.patterns.behavioral.visitor.service.visitor;

public interface Element<T> {

    void accept(T object, Visitor visitor);
}
