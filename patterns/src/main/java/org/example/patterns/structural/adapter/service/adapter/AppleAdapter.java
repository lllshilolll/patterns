package org.example.patterns.structural.adapter.service.adapter;


import org.example.patterns.structural.adapter.domain.AppleA;
import org.example.patterns.structural.adapter.domain.dto.AppleDto;
import org.example.patterns.structural.adapter.domain.enums.Color;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AppleAdapter implements BaseAdapter<AppleA, AppleDto> {
    @Override
    public AppleDto mapToDto(AppleA src) {
        return AppleDto.builder()
                .color(src.getColor().name())
                .fullName(src.getName())
                .weight(BigDecimal.valueOf(src.getWeight()))
                .build();
    }

    @Override
    public AppleA mapToEntity(AppleDto dto) {
        return AppleA.builder()
                .color(Color.fromString(dto.getColor()))
                .weight(dto.getWeight().intValue())
                .name(dto.getFullName())
                .build();
    }
}
