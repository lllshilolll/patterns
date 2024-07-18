package org.example.patterns.behavioral.visitor.service.visitor;

import org.example.patterns.behavioral.visitor.domain.AgreementDocument;
import org.example.patterns.behavioral.visitor.domain.OrderDocument;
import org.example.patterns.behavioral.visitor.domain.PaymentDocument;

public interface Visitor {

    void visit(AgreementDocument agreementDocument);

    void visit(PaymentDocument paymentDocument);

    void visit(OrderDocument orderDocument);

}
