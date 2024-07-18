package org.example.patterns.behavioral.observer.service.custom.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.observer.domain.FruitO;
import org.example.patterns.behavioral.observer.service.custom.MyMessageService;
import org.example.patterns.behavioral.observer.service.custom.Observer;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MyMessageServiceImpl implements MyMessageService, Observer<FruitO> {

    @Override
    public void sendMessage(FruitO fruit) {
        log.info("sending message about fruit {}", fruit);
    }

    @Override
    public void update(FruitO object) {
        sendMessage(object);
    }
}
