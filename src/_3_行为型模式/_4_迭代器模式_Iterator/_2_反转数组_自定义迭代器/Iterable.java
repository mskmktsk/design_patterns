package _3_行为型模式._4_迭代器模式_Iterator._2_反转数组_自定义迭代器;

public interface Iterable<T> {
    Iterator<T> iterator();
}
