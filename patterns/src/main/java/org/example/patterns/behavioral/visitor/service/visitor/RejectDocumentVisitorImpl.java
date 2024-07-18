package org.example.patterns.behavioral.visitor.service.visitor;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.visitor.domain.AgreementDocument;
import org.example.patterns.behavioral.visitor.domain.OrderDocument;
import org.example.patterns.behavioral.visitor.domain.PaymentDocument;
import org.springframework.stereotype.Service;

@Slf4j
@Service("rejectDocumentVisitor")
public class RejectDocumentVisitorImpl implements Visitor {

    @Override
    public void visit(AgreementDocument agreementDocument) {
        log.info("Reject Visiting AgreementDocument {}", agreementDocument);
    }

    @Override
    public void visit(PaymentDocument paymentDocument) {
        log.info("Reject Visiting PaymentDocument {}", paymentDocument);

    }

    @Override
    public void visit(OrderDocument orderDocument) {
        log.info("Reject Visiting OrderDocument {}", orderDocument);

    }
}
