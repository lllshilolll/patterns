package org.example.patterns.structural.adapter.domain.dto;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class AppleDto {

    private String fullName;

    private BigDecimal weight;

    private String color;
}
