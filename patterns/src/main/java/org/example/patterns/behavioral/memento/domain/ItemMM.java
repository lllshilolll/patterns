package org.example.patterns.behavioral.memento.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ItemMM {

    private String name;
    private BigDecimal price;
}
