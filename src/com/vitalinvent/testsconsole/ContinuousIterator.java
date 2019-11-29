package com.vitalinvent.testsconsole;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ContinuousIterator<E> implements Iterator<E> {
    private Collection<E> collection;

    private int counter = 0;
    private Iterator<E> iterator;

    public ContinuousIterator(Collection<E> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return counter < collection.size();
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        counter++;
        if (iterator == null || !iterator.hasNext()) {
            iterator = collection.iterator();
        }

        return iterator.next();
    }

    @Override
    public void remove() {
        counter--;
        iterator.remove();
    }

    public void setDone() {
        counter = 0;
    }
}