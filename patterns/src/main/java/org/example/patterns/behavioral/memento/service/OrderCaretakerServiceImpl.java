package org.example.patterns.behavioral.memento.service;

import org.example.patterns.behavioral.memento.domain.ItemMM;
import org.example.patterns.behavioral.memento.domain.MementoOrder;
import org.example.patterns.behavioral.memento.domain.OrderMM;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class OrderCaretakerServiceImpl implements CaretakerService<OrderMM, MementoOrder> {

    private final Map<OrderMM, Deque<MementoOrder>> map;

    public OrderCaretakerServiceImpl() {
        this.map = new HashMap<>();
    }

    @Override
    public void setState(OrderMM order) {
        var targetItem = order.getItems().stream()
                .map(srsItem -> new ItemMM(srsItem.getName(), srsItem.getPrice()))
                .toList();

        getMomentoOrder(order).addLast(new MementoOrder(LocalDateTime.now(), targetItem));
    }

    @Override
    public MementoOrder getLastState(OrderMM order) {
        return getMomentoOrder(order).peekLast();
    }

    @Override
    public List<MementoOrder> getStates(OrderMM order) {
        return getMomentoOrder(order).stream().toList();
    }

    @Override
    public void restore(OrderMM order) {
        var mementoOrder = getMomentoOrder(order).pollLast();
        assert mementoOrder != null;
        order.setItems(mementoOrder.getItems());
    }

    private Deque<MementoOrder> getMomentoOrder(OrderMM order) {
        map.putIfAbsent(order, new LinkedList<>());
        return map.get(order);
    }
}
