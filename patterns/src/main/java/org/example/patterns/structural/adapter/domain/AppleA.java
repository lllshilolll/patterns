package org.example.patterns.structural.adapter.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.patterns.structural.adapter.domain.enums.Color;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@SuperBuilder
public class AppleA extends FruitA implements Serializable {

    private Color color;

}
