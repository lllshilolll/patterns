package org.example.patterns.behavioral.template_method.service;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.template_method.domain.Account;

@Slf4j
public abstract class AbstractCommissionService {

    protected abstract Integer getCommissionSize();

    protected abstract void printMessage();

    public void executeOperation(Account account) {
        printMessage();
        log.info("Commission size {}", getCommissionSize());
        account.setBalance(account.getBalance() - getCommissionSize());
        log.info("Balance {}", account.getBalance());
    }
}
