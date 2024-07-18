package org.example.patterns.behavioral.state.service;

import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.state.domain.Document;
import org.example.patterns.behavioral.state.domain.State;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DocumentServiceImpl implements DocumentService {


    @Override
    public Document create(String name) {
        log.info("Create document {}", name);
        return new Document(name, State.NEW);
    }
}
