package org.example.patterns.adapter.domain;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
public class FruitA implements Serializable {
    private String name;
    private int weight;
}
