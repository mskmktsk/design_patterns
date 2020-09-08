package _3_行为型模式._4_迭代器模式_Iterator._2_反转数组_自定义迭代器;

public class Client {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        ReverseArrayCollection ints = new ReverseArrayCollection<>(array);
        for (Iterator it = ints.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }
}
