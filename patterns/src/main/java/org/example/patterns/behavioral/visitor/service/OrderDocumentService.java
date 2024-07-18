package org.example.patterns.behavioral.visitor.service;

import org.example.patterns.behavioral.visitor.domain.OrderDocument;
import org.example.patterns.behavioral.visitor.service.visitor.Element;
import org.example.patterns.behavioral.visitor.service.visitor.Visitor;

public interface OrderDocumentService extends Element<OrderDocument> {

    void add(OrderDocument orderDocument);

    @Override
    default void accept(OrderDocument object, Visitor visitor) {
        visitor.visit(object);
    }
}
