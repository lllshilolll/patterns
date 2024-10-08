package org.example.patterns.behavioral.state.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document {

    private String name;
    private State state;
}
