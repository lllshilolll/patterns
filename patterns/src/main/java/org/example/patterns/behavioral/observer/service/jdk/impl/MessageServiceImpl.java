package org.example.patterns.behavioral.observer.service.jdk.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.observer.domain.FruitO;
import org.example.patterns.behavioral.observer.service.jdk.MessageService;
import org.springframework.stereotype.Service;

import java.util.Observable;
import java.util.Observer;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService, Observer {

    @Override
    public void sendMessage(FruitO fruit) {
        log.info("sending message about fruit {}", fruit);
    }

    @Override
    public void update(Observable o, Object arg) {
        sendMessage((FruitO) arg);
    }
}
