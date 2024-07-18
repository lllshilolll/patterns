package org.example.patterns.behavioral.visitor.service;

import org.example.patterns.behavioral.visitor.domain.AgreementDocument;
import org.example.patterns.behavioral.visitor.service.visitor.Element;
import org.example.patterns.behavioral.visitor.service.visitor.Visitor;

public interface AgreementDocumentService extends Element<AgreementDocument> {

    void add(AgreementDocument agreementDocument);

    @Override
    default void accept(AgreementDocument object, Visitor visitor) {
        visitor.visit(object);
    }
}
