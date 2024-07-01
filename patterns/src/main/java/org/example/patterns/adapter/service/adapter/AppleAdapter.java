package org.example.patterns.adapter.service.adapter;


import org.example.patterns.adapter.domain.Apple;
import org.example.patterns.adapter.domain.dto.AppleDto;
import org.example.patterns.adapter.domain.enums.Color;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AppleAdapter implements BaseAdapter<Apple, AppleDto> {
    @Override
    public AppleDto mapToDto(Apple src) {
        return AppleDto.builder()
                .color(src.getColor().name())
                .fullName(src.getName())
                .weight(BigDecimal.valueOf(src.getWeight()))
                .build();
    }

    @Override
    public Apple mapToEntity(AppleDto dto) {
        return Apple.builder()
                .color(Color.fromString(dto.getColor()))
                .weight(dto.getWeight().intValue())
                .name(dto.getFullName())
                .build();
    }
}
