package org.example.patterns.behavioral.visitor.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.visitor.domain.AgreementDocument;
import org.example.patterns.behavioral.visitor.domain.OrderDocument;
import org.example.patterns.behavioral.visitor.domain.PaymentDocument;
import org.example.patterns.behavioral.visitor.service.AgreementDocumentService;
import org.example.patterns.behavioral.visitor.service.OrderDocumentService;
import org.example.patterns.behavioral.visitor.service.PaymentDocumentService;
import org.example.patterns.behavioral.visitor.service.visitor.Visitor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final Visitor rejectDocumentVisitor;
    private final Visitor signingDocumentVisitor;

    private final AgreementDocumentService agreementDocumentService;
    private final OrderDocumentService orderDocumentService;
    private final PaymentDocumentService paymentDocumentService;

    @Override
    public void run(String... args) {
        log.info("test visitor");

        var agreementDoc = new AgreementDocument("agree doc");
        var paymentDoc = new PaymentDocument("payment doc");
        var orderDoc = new OrderDocument("order doc");

        agreementDocumentService.accept(agreementDoc, signingDocumentVisitor);
        agreementDocumentService.accept(agreementDoc, rejectDocumentVisitor);

        orderDocumentService.accept(orderDoc, signingDocumentVisitor);
        orderDocumentService.accept(orderDoc, rejectDocumentVisitor);

        paymentDocumentService.accept(paymentDoc, signingDocumentVisitor);
        paymentDocumentService.accept(paymentDoc, rejectDocumentVisitor);
    }
}
