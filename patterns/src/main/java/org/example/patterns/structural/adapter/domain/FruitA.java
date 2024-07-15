package org.example.patterns.structural.adapter.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
public class FruitA implements Serializable {
    private String name;
    private int weight;
}
