package org.example.patterns.behavioral.visitor.service;

import org.example.patterns.behavioral.visitor.domain.PaymentDocument;
import org.example.patterns.behavioral.visitor.service.visitor.Element;
import org.example.patterns.behavioral.visitor.service.visitor.Visitor;

public interface PaymentDocumentService extends Element<PaymentDocument> {

    void add(PaymentDocument paymentDocument);

    @Override
    default void accept(PaymentDocument object, Visitor visitor) {
        visitor.visit(object);
    }
}
