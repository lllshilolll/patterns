package org.example.patterns.behavioral.chain_of_responsibility.service;

import org.example.patterns.behavioral.chain_of_responsibility.domain.SaladCR;
import org.example.patterns.behavioral.chain_of_responsibility.domain.VegetableCR;

import java.util.List;

public interface SaladServiceCR {

    SaladCR create(String name, String receipt, List<VegetableCR> vegetableCRList);
}
