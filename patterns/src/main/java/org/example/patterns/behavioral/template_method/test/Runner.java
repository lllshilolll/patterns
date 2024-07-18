package org.example.patterns.behavioral.template_method.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.template_method.domain.Account;
import org.example.patterns.behavioral.template_method.service.MaxCommissionService;
import org.example.patterns.behavioral.template_method.service.MinCommissionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final MaxCommissionService maxCommissionService;
    private final MinCommissionService minCommissionService;

    @Override
    public void run(String... args) {
        log.info("test template method");
        var account1 = new Account(1000);
        var account2 = new Account(1000);

        minCommissionService.executeOperation(account1);
        maxCommissionService.executeOperation(account2);
    }
}
