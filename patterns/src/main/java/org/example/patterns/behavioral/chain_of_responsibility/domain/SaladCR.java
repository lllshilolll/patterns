package org.example.patterns.behavioral.chain_of_responsibility.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaladCR {

    private String name;

    private List<VegetableCR> vegetableCRList;

    private String receipt;
}
