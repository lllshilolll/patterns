package org.example.patterns.behavioral.memento.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.behavioral.memento.domain.ItemMM;
import org.example.patterns.behavioral.memento.domain.MementoOrder;
import org.example.patterns.behavioral.memento.domain.OrderMM;
import org.example.patterns.behavioral.memento.service.CaretakerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final CaretakerService<OrderMM, MementoOrder> orderMementoService;

    @Override
    public void run(String... args) {
        log.info("test memento");

        var item1_1 = new ItemMM("disk", BigDecimal.valueOf(500));
        var item1_2 = new ItemMM("usb", BigDecimal.valueOf(999.99));
        var order1 = new OrderMM(UUID.randomUUID(), List.of(item1_1, item1_2));

        var item2_1 = new ItemMM("book", BigDecimal.valueOf(1000));
        var item2_2 = new ItemMM("note", BigDecimal.valueOf(90));
        var order2 = new OrderMM(UUID.randomUUID(), List.of(item2_1, item2_2));

        log.info("Create order1: {}", order1);
        log.info("Order1 contains items {}", order1.getItems().toString());

        log.info("Create order2: {}", order2);
        log.info("Order2 contains items {}", order2.getItems().toString());

        log.info("Save state order");
        orderMementoService.setState(order1);
        orderMementoService.setState(order2);

        log.info("Change order");

        order1.getItems().forEach(item -> item.setPrice(BigDecimal.valueOf(100)));
        order2.setItems(List.of(item2_2));

        log.info("Order1 contains items {}", order1.getItems().toString());
        log.info("Order2 contains items {}", order2.getItems().toString());

        log.info("Order1 states {}", orderMementoService.getStates(order1));
        log.info("Order2 states {}", orderMementoService.getStates(order2));

        log.info("Restore order");

        orderMementoService.restore(order1);
        orderMementoService.restore(order2);

        log.info("Order1 contains items {}", order1.getItems().toString());
        log.info("Order2 contains items {}", order2.getItems().toString());

        log.info("Order1 states {}", orderMementoService.getStates(order1));
        log.info("Order2 states {}", orderMementoService.getStates(order2));
    }
}
