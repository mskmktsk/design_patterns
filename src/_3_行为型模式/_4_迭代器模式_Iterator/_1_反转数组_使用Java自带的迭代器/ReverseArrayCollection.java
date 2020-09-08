package _3_行为型模式._4_迭代器模式_Iterator._1_反转数组_使用Java自带的迭代器;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseArrayCollection<T> implements Iterable<T> {
    private T[] array;

    public ReverseArrayCollection(T... objs) {
        this.array = Arrays.copyOfRange(objs, 0, objs.length);
    }

    public Iterator<T> iterator() {
        return new ReverseIterator();
    }

    private class ReverseIterator implements Iterator<T> {
        int index;

        public ReverseIterator() {
            index = ReverseArrayCollection.this.array.length;
        }

        public boolean hasNext() {
            return index > 0;
        }

        public T next() {
            index--;
            return array[index];
        }
    }
}
