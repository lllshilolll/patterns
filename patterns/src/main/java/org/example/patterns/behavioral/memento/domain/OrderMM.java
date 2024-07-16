package org.example.patterns.behavioral.memento.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderMM extends AbstractOrderMM {

    private final UUID orderId;

    public OrderMM(UUID orderId, List<ItemMM> items) {
        super(items);
        this.orderId = orderId;
    }

}
