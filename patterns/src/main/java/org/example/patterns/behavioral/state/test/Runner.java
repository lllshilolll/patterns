package org.example.patterns.behavioral.state.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.state.domain.State;
import org.example.patterns.behavioral.state.service.DocumentService;
import org.example.patterns.behavioral.state.service.DocumentStateContextService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final DocumentService documentService;
    private final DocumentStateContextService context;

    @Override
    public void run(String... args) {
        log.info("test state");

        var document = documentService.create("Document1");
        context.doWork(document, State.IN_WORK);
        context.doWork(document, State.COMPLETED);
        context.doWork(document, State.NEW);
    }
}
