package org.example.patterns.adapter.domain.dto;


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
