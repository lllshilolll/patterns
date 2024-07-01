package org.example.patterns.adapter.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.patterns.adapter.domain.enums.Color;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
@SuperBuilder
public class Apple extends Fruit implements Serializable {

    private Color color;

}
