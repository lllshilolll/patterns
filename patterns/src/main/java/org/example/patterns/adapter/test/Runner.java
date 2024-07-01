package org.example.patterns.adapter.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.patterns.adapter.domain.AppleA;
import org.example.patterns.adapter.domain.dto.AppleDto;
import org.example.patterns.adapter.domain.enums.Color;
import org.example.patterns.adapter.service.adapter.AppleAdapter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final AppleAdapter adapter;

    @Override
    public void run(String... args) {
        log.info("test adapter");

        var apple = AppleA.builder()
                .name("apple")
                .color(Color.GREEN)
                .weight(10)
                .build();

        var appleDto = adapter.mapToDto(apple);

        log.info("appleDto: {}", appleDto);

        var appleDto2 = AppleDto.builder()
                .color("RED")
                .weight(new BigDecimal(100))
                .fullName("APPLE")
                .build();

        var appleEntity = adapter.mapToEntity(appleDto2);

        log.info("appleEntity: {}", appleEntity);
    }
}
