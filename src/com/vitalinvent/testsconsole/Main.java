package com.vitalinvent.testsconsole;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ContinuousIterator continuousIterator = new ContinuousIterator(Arrays.asList(1, 2, 3));
        Object e0 = continuousIterator.next();
        continuousIterator.setDone();
        Object e2 = continuousIterator.next();
        Object e3 = continuousIterator.next();
        Object e4 = continuousIterator.next();
        Object e5 = continuousIterator.next();

    }
}
