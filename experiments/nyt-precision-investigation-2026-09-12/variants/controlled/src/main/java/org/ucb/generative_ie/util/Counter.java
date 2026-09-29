package org.ucb.generative_ie.util;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

public class Counter {

    public static <E> Multiset<E> sum(Multiset<E> c1, Multiset<E> c2) {
        return Multisets.sum(c1, c2);
    }

    public static <E> Multiset<E> difference(Multiset<E> c1, Multiset<E> c2) {
        return Multisets.difference(c1, c2);
    }
}
