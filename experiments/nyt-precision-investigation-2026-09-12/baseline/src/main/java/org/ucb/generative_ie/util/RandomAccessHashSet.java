package org.ucb.generative_ie.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomAccessHashSet<E> {

    public RandomAccessHashSet() {
        super();
        this.index = new HashMap<>();
        this.values = new ArrayList<>();
    }

    public RandomAccessHashSet(RandomAccessHashSet<E> other) {
        this.index = new HashMap<>(other.index);
        this.values = new ArrayList<>(other.values);
    }

    public static<E extends Object>  RandomAccessHashSet <E> copyof(Collection<? extends E> elements){
        RandomAccessHashSet <E> newRandomAccessHashSet = new RandomAccessHashSet();
        for (E e:elements){
            newRandomAccessHashSet.add(e);
        }
        return newRandomAccessHashSet;
    }

    HashMap<E, Integer> index;
    ArrayList<E> values;

    public boolean add(E value) {
        if (contains(value)) {
            return false;
        }

        values.add(value);
        index.put(value, values.size() - 1);
        return true;
    }

    public boolean remove(E value) {
        if (contains(value)) {
            int removedIndex = index.get(value);
            index.remove(value);

            int originalEndIndex = values.size() - 1;

            if (removedIndex == originalEndIndex) {
                values.remove(originalEndIndex);
            }
            else {
                E endObject = values.remove(originalEndIndex);
                values.set(removedIndex, endObject);

                assert index.containsKey(endObject);
                index.put(endObject, removedIndex);
            }

            return true;
        }
        return false;
    }

    public boolean contains(E value) {
        return index.containsKey(value);
    }

    public E getRandom(Random rng) {
        return Util.choice(values, rng);
    }

    public Set<E> values() {
        return index.keySet();
    }

    public List<E> asList() {
        return values;
    }

    public int indexOf(E key) {
        if (index.containsKey(key)) {
            return index.get(key);
        }
        else {
            return -1;
        }
    }

    public E getCanonical(E value) {
        if (index.containsKey(value)) {
            return this.values.get(index.get(value));
        }
        else {
            throw new RuntimeException("value does not exist");
        }
    }

    public void clear() {
        index.clear();
        values.clear();
    }

    public int size() {
        return values.size();
    }
}
