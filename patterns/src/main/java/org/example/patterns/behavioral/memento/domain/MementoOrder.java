package org.example.patterns.behavioral.memento.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MementoOrder extends AbstractOrderMM {

    private LocalDateTime orderDateTime;

    public MementoOrder(LocalDateTime localDateTime, List<ItemMM> items) {
        super(items);
        this.orderDateTime = localDateTime;
    }

}
