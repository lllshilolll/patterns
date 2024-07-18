package org.example.patterns.behavioral.visitor.service.visitor;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.visitor.domain.AgreementDocument;
import org.example.patterns.behavioral.visitor.domain.OrderDocument;
import org.example.patterns.behavioral.visitor.domain.PaymentDocument;
import org.springframework.stereotype.Service;

@Slf4j
@Service("signingDocumentVisitor")
public class SigningDocumentVisitorImpl implements Visitor {

    @Override
    public void visit(AgreementDocument agreementDocument) {
        log.info("Signing Visiting AgreementDocument {}", agreementDocument);
    }

    @Override
    public void visit(PaymentDocument paymentDocument) {
        log.info("Signing Visiting PaymentDocument {}", paymentDocument);
    }

    @Override
    public void visit(OrderDocument orderDocument) {
        log.info("Signing Visiting OrderDocument {}", orderDocument);
    }
}
