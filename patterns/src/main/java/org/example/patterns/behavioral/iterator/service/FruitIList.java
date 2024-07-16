package org.example.patterns.behavioral.iterator.service;

import org.example.patterns.behavioral.iterator.domain.FruitI;

import java.util.Iterator;

//@Service
public class FruitIList implements Iterable<FruitI> {

    private final FruitI[] fruitArray;

    public FruitIList(FruitI... fruitArray) {
        this.fruitArray = fruitArray;
    }

    @Override
    public Iterator<FruitI> iterator() {
        return new FruitIIterator();
    }

    private class FruitIIterator implements Iterator<FruitI> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < fruitArray.length;
        }

        @Override
        public FruitI next() {
            return fruitArray[index++];
        }
    }
}
